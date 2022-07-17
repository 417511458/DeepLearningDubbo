package com.yuqiao.deeplearningdubbo.demo.provider;

import com.yuqiao.deeplearningdubbo.demo.api.DemoService;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
