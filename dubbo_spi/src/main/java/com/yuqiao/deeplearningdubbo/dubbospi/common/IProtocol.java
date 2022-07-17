package com.yuqiao.deeplearningdubbo.dubbospi.common;

import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * 通讯协议接口
 */
@SPI
public interface IProtocol {
    //发送请求
    @Adaptive
    void sendRequest(String message);
}
