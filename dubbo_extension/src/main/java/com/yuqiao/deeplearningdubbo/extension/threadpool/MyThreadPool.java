package com.yuqiao.deeplearningdubbo.extension.threadpool;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.threadlocal.NamedInternalThreadFactory;
import org.apache.dubbo.common.threadpool.ThreadPool;
import org.apache.dubbo.common.threadpool.support.AbortPolicyWithReport;

import java.util.concurrent.*;


/**
 * 自定义线程池
 */
public class MyThreadPool implements ThreadPool {
    @Override
    public Executor getExecutor(URL url) {
        //此处是创建线程池的核心逻辑
        //可以通过JDK中的ThreadPoolExecutor构造自己的线程池
        //也可以参考Dubbo中的EagerThreadPool，自己实现特殊逻辑的线程池

        //下面只是模拟实现一个线程池
        return new ThreadPoolExecutor(1, 200, 0, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(100),
                new NamedInternalThreadFactory("MyThreadPool", true),
                new AbortPolicyWithReport("MyThreadPool", url));
    }
}
