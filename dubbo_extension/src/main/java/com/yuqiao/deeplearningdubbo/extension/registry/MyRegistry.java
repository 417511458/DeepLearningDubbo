package com.yuqiao.deeplearningdubbo.extension.registry;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.registry.NotifyListener;
import org.apache.dubbo.registry.support.FailbackRegistry;

/**
 * 自实现的注册中心
 */
public class MyRegistry extends FailbackRegistry {
    public MyRegistry(URL url){super(url);}
    @Override
    public void doRegister(URL url) {
        //在此实现自定义注册中心注册的关键代码
        //一般情况下是向注册中心媒介保存服务数据（如ZookeeperRegistry，向ZK写数据）
    }

    @Override
    public void doUnregister(URL url) {
        //在此实现自定义注册中心取消注册的关键代码
        //一般情况下是删除注册中心媒介中的服务数据（如ZookeeperRegistry，删除ZK中的数据）
    }

    @Override
    public void doSubscribe(URL url, NotifyListener listener) {
        //在此实现自定义注册中心订阅的关键代码
        //一般情况下是利用注册中心媒介的发布订阅功能（如ZookeeperRegistry，给ZK中的服务节点添加变更监听事件）
    }

    @Override
    public void doUnsubscribe(URL url, NotifyListener listener) {
        //在此实现自定义注册中心取消订阅的关键代码
        //以ZookeeperRegistry为例，将添加的变更监听给移除掉
    }

    @Override
    public boolean isAvailable() {
        //返回注册中心的状态，这个要结合注册中心媒介的状态
        //比如注册中心媒介挂了、断开连接了，即不可用了
        return false;
    }
}
