package com.yzb.factory.method;

/**
 * @author yzb
 */
public class DogFactory implements AnimalFactory {

    /**
     *
     * @return dog
     */
    @Override
    public Animal getAnimal() {
        return new Dog();
    }
}
