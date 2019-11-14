package com.prachi;

/**
 * @author prachi
 */
public class ReverseNum {
    public static void main(String[] args) {

        ReverseNum reverseNum = new ReverseNum();

        int reversedNum = reverseNum.reverse(1534236469);
        System.out.println("Reversed number is " + reversedNum);

    }

    public int reverse(int x) {
        int remainder = 0;
        long reversedNum = 0;
        while (x != 0) {
            remainder = x % 10;
            reversedNum = reversedNum * 10 + remainder;
            x = x / 10;
        }
        if (reversedNum < Integer.MIN_VALUE || reversedNum > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) reversedNum;
        }
    }
}
