package com.prachi;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author prachi
 */
public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 3};
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        System.out.println("Length of modified array is  " + removeDuplicate.removeDuplicates(arr));

    }

    public int removeDuplicates(int[] nums) {

        int length = 1;
        int count =0;
        for (int i = 0; i < nums.length; i++) {


            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                  count++;
                }
            }

        }
        System.out.println(Arrays.toString(nums));
        return length;
    }
}
