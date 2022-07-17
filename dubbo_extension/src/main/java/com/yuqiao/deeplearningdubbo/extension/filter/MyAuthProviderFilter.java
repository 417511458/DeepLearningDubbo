package com.yuqiao.deeplearningdubbo.extension.filter;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.common.utils.StringUtils;
import org.apache.dubbo.rpc.*;

import static org.apache.dubbo.common.constants.CommonConstants.PROVIDER;

/**
 * 权限校验的服务提供者端过滤器
 *
 * 采用自动激活机制，自动在服务提供者端激活
 */
@Activate(group = PROVIDER)
public class MyAuthProviderFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        //校验权限
//        checkAuth(invoker,invocation);
        //继续执行调用链
        return invoker.invoke(invocation);
    }

    //校验权限
    public void checkAuth(Invoker<?> invoker, Invocation invocation){
        String token = invocation.getAttachment("token");
        System.out.println("token : " + token);
        if(StringUtils.isBlank(token)){
            throw new RpcException("Token is blank.");
        }
        //
        //省略其他权限校验的逻辑
        //如从DB/缓存中获取token对应的调用权限
        //校验当前调用的接口/方法是否符合调用调用规则
        //如果不符合调用规则，直接抛出RpcException
    }
}
