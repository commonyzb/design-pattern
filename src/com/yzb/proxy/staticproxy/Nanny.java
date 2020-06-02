package com.yzb.proxy.staticproxy;

/**
 * 保姆类实现家务接口
 * @author yzb
 */
public class Nanny implements Housework {

    Housework housework;

    public Nanny(Housework housework){
        this.housework = housework;
    }

    public void before(){
        System.out.println("洗碗之前...");
    }

    @Override
    public void washingDishes() {
        before();
        housework.washingDishes();
        System.out.println("但是你今天不想洗碗");
        System.out.println("请保姆来代理洗碗家务了");
        after();
    }

    public void after(){
        System.out.println("洗碗之后...");
    }
}
