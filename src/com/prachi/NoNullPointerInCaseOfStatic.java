package com.prachi;

/**
 * @author prachi
 */
public class NoNullPointerInCaseOfStatic {

    public static String find(String input){


        return "s";

    }

    public static void main(String[] args) {
        NoNullPointerInCaseOfStatic obj =null;
        System.out.println(obj.find("")); // compiler optimizes code and replace obj to Class name
    }
}
