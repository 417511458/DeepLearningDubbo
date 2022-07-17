package com.yuqiao.deeplearningdubbo.analysis.base;

import java.util.Random;

public class DemoServiceImpl2 implements DemoService2 {
    @Override
    public String sayHello(String name) {
        try {
            System.out.println(Thread.currentThread().getName() + ":sleeping...");
            Thread.sleep(new Random().nextInt(100));
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
