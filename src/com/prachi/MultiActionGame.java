package com.prachi;

/**
 * @author prachi
 */
public class MultiActionGame extends Game {

    @Override
    public boolean isInitialInteraction(){

        System.out.println("Inside Child class");
        return false;

    }
}
