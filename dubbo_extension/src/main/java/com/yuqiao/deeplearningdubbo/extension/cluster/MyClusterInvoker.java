package com.yuqiao.deeplearningdubbo.extension.cluster;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;
import org.apache.dubbo.rpc.cluster.Directory;
import org.apache.dubbo.rpc.cluster.LoadBalance;
import org.apache.dubbo.rpc.cluster.support.AbstractClusterInvoker;

import java.util.List;

/**
 * 自定义的ClusterInvoker
 * @param <T>
 */
public class MyClusterInvoker<T> extends AbstractClusterInvoker<T> {
    public MyClusterInvoker(Directory<T> directory) {
        super(directory);
    }

    public MyClusterInvoker(Directory<T> directory, URL url) {
        super(directory, url);
    }

    @Override
    protected Result doInvoke(Invocation invocation, List<Invoker<T>> invokers, LoadBalance loadbalance) throws RpcException {
        //此处是调用远程服务的关键逻辑
        //一般要做以下事情：
        //1. 检查invokers的状态，如是否为空，是否可用
        //2. 通过父类AbstractClusterInvoker的select方法，   使用loadbalance，选择调用的Invoker
        //3. 通过上一步选中的Invoker调用远程服务
        //4. 在完成以上步骤的基础上，添加自己的容错逻辑，比如调用出错了是重试、是抛异常还是其他
        //5. return 结果，一般为第三步的结果，或者出错后自定义的结果
        //return null;
        checkInvokers(invokers, invocation);
        Invoker<T> invoker = select(loadbalance, invocation, invokers, null);
        try {
            return invoker.invoke(invocation);
        } catch (Throwable e) {
            throw new RpcException(e);
        }
    }
}
