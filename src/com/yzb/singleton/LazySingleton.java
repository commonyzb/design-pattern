package com.yzb.singleton;

/**
 * 懒汉式单例
 * 优点：做到了延迟加载和线程安全
 * volatile关键字禁止指令重排，双重校验锁保证线程安全
 * @author yzb
 */
public class LazySingleton {

    private static volatile LazySingleton lazySingleton;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
