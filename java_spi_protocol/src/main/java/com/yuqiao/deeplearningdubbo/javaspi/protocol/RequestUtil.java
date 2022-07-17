package com.yuqiao.deeplearningdubbo.javaspi.protocol;

public class RequestUtil {

    //根据依赖倒置原则，这里依赖的是IProtocol接口，而不是具体的实现类。
    private IProtocol protocol;

    public void sendRequest(String message){
        //根据里氏替换原则，这个protocol可以使用子类HttpProtocol或TcpProtocol替换
        protocol.sendRequest(message);
    }

    public RequestUtil() {
    }
    public RequestUtil(IProtocol protocol) {
        this.protocol = protocol;
    }
    public IProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(IProtocol protocol) {
        this.protocol = protocol;
    }
}
