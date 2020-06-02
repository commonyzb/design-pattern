package com.yzb.factory.simple;

/**
 * 简单工厂模式：实现了创建者和调用者的分离；调用者不必知道具体的类名，只需知道具体产品类对应的参数即可；
 * 缺点：违反了开闭原则，增加产品类型是，必须覆盖原有代码；产品类型较多时，不易拓展和维护；职责过重，一旦出现问题，整个系统可能都会受到影响
 * @author yzb
 */
public class SimpleFactory {
    public static void main(String[] args){
        Animal dog = AnimalFactory.getAnimal("狗狗");
        System.out.println(dog.getName());
        Animal cat = AnimalFactory.getAnimal("猫猫");
        System.out.println(cat.getName());
    }
}
