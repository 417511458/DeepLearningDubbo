package com.yuqiao.deeplearningdubbo.extension.registry;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.registry.Registry;
import org.apache.dubbo.registry.support.AbstractRegistryFactory;

/**
 * 自定义注册中心的工厂
 */
public class MyRegistryFactory extends AbstractRegistryFactory {
    @Override
    protected Registry createRegistry(URL url) {
        return new MyRegistry(url);
    }
}
