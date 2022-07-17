package com.yuqiao.deeplearningdubbo.dubbospi.common;

/**
 * Test通讯协议
 */
public class TestProtocol implements IProtocol {
    @Override
    public void sendRequest(String message) {
        //示意代码，省略实现细节
        System.out.println("使用Test发送消息：" + message);
    }
}
