package com.yzb.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 * @author yzb
 */
public class DynamicProxy {
    public static void main(String[] args) {
        Housework person = new Person();
        HouseworkHandler houseworkHandler = new HouseworkHandler(person);
        Housework person1 = (Housework) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                houseworkHandler);
        person1.washingDishes();
    }
}
