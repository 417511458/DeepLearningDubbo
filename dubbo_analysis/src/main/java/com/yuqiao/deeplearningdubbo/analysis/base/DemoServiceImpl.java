package com.yuqiao.deeplearningdubbo.analysis.base;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        try {
            System.out.println(Thread.currentThread().getName() + ":sleeping...");
            Thread.sleep(1500l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello " + name;
    }

    @Override
    public String sayHello2(String name) {
        return null;
    }
}
