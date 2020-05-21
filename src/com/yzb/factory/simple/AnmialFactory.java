package com.yzb.factory.simple;

/**
 * @author yzb
 */
public class AnmialFactory {

    public static Anmial getAnmial(String type){
        Anmial anmial;
        switch (type){
            case "狗狗": anmial = new Dog(); break;
            case "猫猫": anmial =  new Cat(); break;
            default: anmial = null; break;
        }
        return anmial;
    }

    public static Anmial getDog(){
        return new Dog();
    }

    public static Anmial getCat(){
        return new Cat();
    }

}
