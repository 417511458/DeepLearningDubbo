package com.yuqiao.deeplearningdubbo.extension.loadbalance;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance;

import java.util.List;

/**
 * 自定义负载均衡器
 */
public class MyLoadBalance extends AbstractLoadBalance {
    @Override
    protected <T> Invoker<T> doSelect(List<Invoker<T>> invokers, URL url, Invocation invocation) {
        //此处是负载均衡算法的核心逻辑
        //要根据自己的业务特点，实现自己的负载均衡算法
        //可以参考已有的算法逻辑，实现自己的。
        return invokers.get(0);//模拟负载均衡算法，简单返回第一个
    }
}
