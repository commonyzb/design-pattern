package com.yzb.singleton;

/**
 * 静态内部类单例模式
 * 优点：1.采用类装载的机制来保证初始化实例时只有一个线程,保证多线程安全。2.实现了懒加载。
 */
public class Singleton {

    private Singleton(){
    }

    public static class SingletonHolder{
        public static final Singleton SINGLETON_INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.SINGLETON_INSTANCE;
    }

}
