package com.yuqiao.deeplearningdubbo.demo.consumer;

import com.yuqiao.deeplearningdubbo.demo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Consumer {
    static  ClassPathXmlApplicationContext context;
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String result = demoService.sayHello("world"); // 执行远程方法
        System.out.println( result ); // 显示调用结果
        Thread.sleep(10000000l);
    }



}
