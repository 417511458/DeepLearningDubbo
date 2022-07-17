package com.yuqiao.deeplearningdubbo.dubbospi.common;

/**
 * Tcp通讯协议
 */
public class TcpProtocol implements IProtocol {
    @Override
    public void sendRequest(String message) {
        //示意代码，省略实现细节
        System.out.println("使用TCP发送消息：" + message);
    }
}
