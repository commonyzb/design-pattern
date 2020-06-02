package com.yzb.proxy.staticproxy;

/**
 * 静态代理模式
 * 代理类和被代理类属于同一层次，通过注入被代理类，代理类可以代理其任务，对被代理类的方法做增强等操作
 * @author yzb
 */
public class StaticProxy {
    public static void main(String[] args) {
        Housework person = new Person();
        Housework nanny = new Nanny(person);
        nanny.washingDishes();
    }
}
