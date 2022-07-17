package com.yuqiao.deeplearningdubbo.javaspi.invoker;

import com.yuqiao.deeplearningdubbo.javaspi.protocol.HttpProtocol;
import com.yuqiao.deeplearningdubbo.javaspi.protocol.RequestUtil;
import com.yuqiao.deeplearningdubbo.javaspi.protocol.TcpProtocol;

/**
 * 协议调用方
 * 备注：这里只是模拟，使用Spring的话，把依赖配置为Bean即可
 */
public class JavaSpiProtocolInvoker {
    public static void main(String[] args) {
        //使用tcp通讯
        RequestUtil tcpRequest = new RequestUtil(new TcpProtocol());
        tcpRequest.sendRequest("Hello!");

        //使用http通讯
        RequestUtil httpRequest = new RequestUtil(new HttpProtocol());
        httpRequest.sendRequest("Hello!");
    }
}
