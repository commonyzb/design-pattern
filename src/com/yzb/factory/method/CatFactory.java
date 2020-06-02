package com.yzb.factory.method;

/**
 * @author yzb
 */
public class CatFactory implements AnimalFactory {
    /**
     *
     * @return
     */
    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
