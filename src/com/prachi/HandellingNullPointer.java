package com.prachi;

/**
 * @author prachi
 */
public class HandellingNullPointer {

    public int checkNullForInt(int a) {
        int s = 0;
        try {
            s = ((a > 10) ? null : a);
        } catch (Exception e) {
            System.out.println("Exception caught");

        }
        return s;

    }

    public static void main(String[] args) {
        RetunNullForint retunNullForint = new RetunNullForint();
        System.out.println(retunNullForint.checkNullForInt(11));
    }
}
