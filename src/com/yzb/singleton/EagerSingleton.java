package com.yzb.singleton;

/**
 * 饿汉式单例
 * 优点：做到了线程安全
 * 缺点：占用了较多内存空间
 * @author yzb
 */
public class EagerSingleton {

    private static final EagerSingleton EAGER_SINGLETON = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return EAGER_SINGLETON;
    }

}
