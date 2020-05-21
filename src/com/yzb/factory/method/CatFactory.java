package com.yzb.factory.method;

/**
 * @author yzb
 */
public class CatFactory implements AnmialFactory {
    /**
     *
     * @return
     */
    @Override
    public Anmial getAnmial() {
        return new Cat();
    }
}
