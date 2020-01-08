package com.prachi;

/**
 * @author prachi
 */
public class ClassToTestMethOverriding {


    public static void main(String[] args) {
        ClassToTestMethOverriding classToTestMethOverriding = new ClassToTestMethOverriding();
        classToTestMethOverriding.test(new Game());
    }
    public void test (Game game){
        game.isInitialInteraction();

    }
}
