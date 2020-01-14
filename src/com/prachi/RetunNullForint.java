package com.prachi;

/**
 * @author prachi
 */
public class RetunNullForint {

    public int checkNullForInt(int a) {

        return ((a > 10) ? null : a); // this is not applied for if/else but not accepted for ternary operator
    }

    public static void main(String[] args) {
        RetunNullForint retunNullForint = new RetunNullForint();
        System.out.println(retunNullForint.checkNullForInt(11));
    }
}
