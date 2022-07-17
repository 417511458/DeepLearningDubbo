package com.yuqiao.deeplearningdubbo.dubbospi.basicusage;

import com.yuqiao.deeplearningdubbo.dubbospi.common.IProtocol;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.Set;

public class DubboSPI {

    public static void main(String[] args) {
        //获取ExtensionLoader对象
        ExtensionLoader<IProtocol> extensionLoader = ExtensionLoader.getExtensionLoader(IProtocol.class);
        //通过key获取对象的TcpProtocol
        IProtocol tcpProtocol = extensionLoader.getExtension("tcp");
        tcpProtocol.sendRequest("Hello!");
        //通过key获取对象的HttpProtocol
        IProtocol httpProtocol = extensionLoader.getExtension("http");
        httpProtocol.sendRequest("Hello!");

        Set<String> extensions = extensionLoader.getSupportedExtensions();
        for (String e:extensions
             ) {
            System.out.println(e);
        }
    }
}
