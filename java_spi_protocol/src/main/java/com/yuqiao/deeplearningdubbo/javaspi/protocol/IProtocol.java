package com.yuqiao.deeplearningdubbo.javaspi.protocol;

/**
 * 通讯协议接口
 */
public interface IProtocol {
    //发送请求
    void sendRequest(String message);
}
