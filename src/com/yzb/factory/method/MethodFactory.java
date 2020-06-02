package com.yzb.factory.method;

/**
 * 工厂方法模式：引入工厂接口来声明工厂方法，由子类来具体实现工厂方法；不同的工厂可以创建不同的产品
 * 优点：增加新产品，不影响原有代码
 * 缺点：需要维护的类增多了
 * @author yzb
 */
public class MethodFactory {

    public static void main(String[] args) {
        Animal dog = new DogFactory().getAnimal();
        Animal cat = new CatFactory().getAnimal();
        System.out.println(dog.getName());
        System.out.println(cat.getName());
    }
}
