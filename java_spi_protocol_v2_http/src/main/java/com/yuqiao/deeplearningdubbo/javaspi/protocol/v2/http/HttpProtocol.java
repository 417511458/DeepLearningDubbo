package com.yuqiao.deeplearningdubbo.javaspi.protocol.v2.http;

import com.yuqiao.deeplearningdubbo.javaspi.protocol.v2.IProtocol;

/**
 * Http通讯协议
 */
public class HttpProtocol implements IProtocol {
    @Override
    public void sendRequest(String message) {
        //示意代码，省略实现细节
        System.out.println("使用Http发送消息：" + message);
    }
}
