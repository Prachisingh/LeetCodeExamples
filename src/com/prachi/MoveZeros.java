package com.prachi;

/**
 * @author prachi
 */
public class MoveZeros {

    public int[] moveZeroes(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                //perform swap
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}
