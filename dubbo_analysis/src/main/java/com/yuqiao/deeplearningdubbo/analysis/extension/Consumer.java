package com.yuqiao.deeplearningdubbo.analysis.extension;

import com.yuqiao.deeplearningdubbo.analysis.base.DemoService;
import com.yuqiao.deeplearningdubbo.analysis.base.DemoService2;
import com.yuqiao.deeplearningdubbo.analysis.base.DemoService3;
import org.apache.dubbo.rpc.RpcContext;
import org.apache.dubbo.rpc.cluster.Constants;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Consumer {
    static  ExecutorService executorService = new ThreadPoolExecutor(200, 500,
            30L, TimeUnit.SECONDS,
            new LinkedBlockingDeque<>(200),new ThreadPoolExecutor.CallerRunsPolicy());
    static  ClassPathXmlApplicationContext context;
    public static void main(String[] args) throws Exception {
        context = new ClassPathXmlApplicationContext(new String[] {"extension/dubbo-consumer.xml"});
        context.start();

        loop(100);
        Thread.sleep(10000000l);
    }

    public static void loop(int count){
        for (int i = 0;i < count;i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    RpcContext.getContext().setAttachment(Constants.TAG_KEY,"tag1");

                    try {
                        basicUse2();
                    } catch (Exception e) {

                    }
                }
            });
        }
    }
    public static void basicUse(){
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }

    public static void basicUse2(){
        DemoService2 demoService = (DemoService2)context.getBean("demoService2"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }

    public static void providerIsNotExist(){
        //获取没有服务提供方的服务，看看校验过程
        DemoService3 demoService3= (DemoService3)context.getBean("demoService3"); // 获取远程服务代理
        System.out.println( demoService3.sayHello("world") ); // 显示调用结果

    }

}
