package com.yuqiao.deeplearningdubbo.javaspi.protocol.v2;

/**
 * 通讯协议接口
 */
public interface IProtocol {
    //发送请求
    void sendRequest(String message);
}
