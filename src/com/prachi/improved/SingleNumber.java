package com.prachi.improved;

import java.util.Arrays;

/**
 * @author prachi
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = -1;
        int count;
        int length = nums.length;
        boolean noResult=true;
        for (int i = 0; i < nums.length - 1; ) {
            count = 1;
            if (nums[i] == nums[i + 1]) {
                count++;
            }
            if (count == 2) {
                i=i+2;
                continue;
            } else {
                noResult=false;
                result = nums[i];
                break;
            }
        }
        if (noResult) {
            result = nums[length - 1];
        }
        return result;
    }


    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int []{1,3,1,-1,3}));
    }

}
