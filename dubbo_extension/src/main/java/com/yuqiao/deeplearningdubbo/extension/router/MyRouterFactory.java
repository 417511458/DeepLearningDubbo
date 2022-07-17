package com.yuqiao.deeplearningdubbo.extension.router;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.configcenter.DynamicConfiguration;
import org.apache.dubbo.rpc.cluster.Router;
import org.apache.dubbo.rpc.cluster.RouterFactory;

/**
 * 自定义RouterFactory
 */
@Activate(order = 1)
public class MyRouterFactory implements RouterFactory {
    @Override
    public Router getRouter(URL url) {
        //实例化自定义Router
        return new MyRouter(DynamicConfiguration.getDynamicConfiguration(), url);
    }
}
