package com.yzb.proxy.dynamicproxy;

/**
 * @author yzb
 */
public class Person implements Housework {

    @Override
    public void washingDishes() {
        System.out.println("今天你要洗碗");
    }
}
