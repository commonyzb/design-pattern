package com.yzb.factory.method;

/**
 * @author yzb
 */
public class DogFactory implements AnmialFactory {

    /**
     *
     * @return
     */
    @Override
    public Anmial getAnmial() {
        return new Dog();
    }
}
