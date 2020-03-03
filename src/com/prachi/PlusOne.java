package com.prachi;

import java.util.Arrays;

/**
 * @author prachi
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {

        for(int i = digits.length-1; i >= 0 ; i--) {

            if(digits[i] < 9){
                digits[i] ++;
                return digits ;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length +1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] arr = plusOne.plusOne(new int[]{9,9,9});
        System.out.println(Arrays.toString(arr));
    }

}
