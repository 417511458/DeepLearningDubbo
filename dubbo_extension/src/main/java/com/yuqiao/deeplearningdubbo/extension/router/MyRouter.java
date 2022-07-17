package com.yuqiao.deeplearningdubbo.extension.router;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.configcenter.ConfigChangeEvent;
import org.apache.dubbo.configcenter.ConfigurationListener;
import org.apache.dubbo.configcenter.DynamicConfiguration;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.RpcException;
import org.apache.dubbo.rpc.cluster.router.AbstractRouter;

import java.util.List;

/**
 * 自定义Router
 */
public class MyRouter extends AbstractRouter implements ConfigurationListener {
    public MyRouter(){}
    public MyRouter(DynamicConfiguration configuration,URL url){
        super(configuration,url);
    }

    @Override
    public void process(ConfigChangeEvent event) {
        //此处处理配置变事件
        //一般是要将配置文本，解析成为自定义的路由规则
    }

    @Override
    public <T> List<Invoker<T>> route(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {
        //路由的核心处理逻辑
        //此处要根据自定义的路由规则，过滤符合条件的invokers
        //最后只返回符合条件的invokers
        return invokers;
    }
}
