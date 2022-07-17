package com.yuqiao.deeplearningdubbo.extension.cluster;

import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.RpcException;
import org.apache.dubbo.rpc.cluster.Cluster;
import org.apache.dubbo.rpc.cluster.Directory;

/**
 * 自定义的Cluster
 */
public class MyCluster implements Cluster {

    public final static String NAME = "myCluster";

    @Override
    public <T> Invoker<T> join(Directory<T> directory) throws RpcException {
        return new MyClusterInvoker<>(directory);
    }

}
