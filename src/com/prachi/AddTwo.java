package com.prachi;

import java.util.Arrays;

/**
 * @author prachi
 */
public class AddTwo {
    public static void main(String[] args) {

        AddTwo addTwo = new AddTwo();
        int arr[] = new int[3];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 3;
        int[] resultArray = addTwo.twoSum(arr, 6);
        System.out.println(Arrays.toString(resultArray));
    }

    public int[] twoSum(int[] nums, int target) {
        int calculatedTarget = 0;
        int[] resultantArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            calculatedTarget = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (calculatedTarget == nums[j]) {
                    resultantArray[0] = i;
                    resultantArray[1] = j;
                }
            }


        }
        return resultantArray;
    }

}
