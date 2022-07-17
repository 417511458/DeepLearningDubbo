package com.yuqiao.deeplearningdubbo.javaspi.invoker.v2;


import com.yuqiao.deeplearningdubbo.javaspi.protocol.v2.RequestUtil;

/**
 * 协议调用方
 * 备注：这里只是模拟，使用Spring的话，把依赖配置为Bean即可
 */
public class JavaSpiProtocolInvoker {
    public static void main(String[] args) {
        RequestUtil.getInstance().sendRequest("hello!");
    }
}
