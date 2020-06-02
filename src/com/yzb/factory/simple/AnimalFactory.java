package com.yzb.factory.simple;

/**
 * @author yzb
 */
public class AnimalFactory {

    public static Animal getAnimal(String type){
        Animal Animal;
        switch (type){
            case "狗狗": Animal = new Dog(); break;
            case "猫猫": Animal =  new Cat(); break;
            default: Animal = null; break;
        }
        return Animal;
    }

    public static Animal getDog(){
        return new Dog();
    }

    public static Animal getCat(){
        return new Cat();
    }

}
