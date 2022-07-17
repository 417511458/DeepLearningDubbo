package com.yuqiao.deeplearningdubbo.javaspi.invoker.v2;


import com.yuqiao.deeplearningdubbo.javaspi.protocol.v2.IProtocol;
import com.yuqiao.deeplearningdubbo.javaspi.protocol.v2.RequestUtil;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 协议调用方
 * 备注：这里只是模拟，使用Spring的话，把依赖配置为Bean即可
 */
public class JavaSpiProtocolInvoker2 {
    public static void main(String[] args) {
        //第一步：调用ServiceLoader.load加载实现类
        ServiceLoader<IProtocol> protocols = ServiceLoader.load(IProtocol.class);
        //第二步：通过遍历获取实现类
        Iterator<IProtocol> iterator = protocols.iterator();
        while (iterator.hasNext()){
            IProtocol protocol = iterator.next();
            System.out.println(protocol);
        }
    }
}
