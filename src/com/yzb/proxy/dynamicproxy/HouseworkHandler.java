package com.yzb.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yzb
 */
public class HouseworkHandler implements InvocationHandler {

    private Object target;

    public HouseworkHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("===========开始代理方法===========");
        Object result = method.invoke(target,args);
        return result;
    }
}
