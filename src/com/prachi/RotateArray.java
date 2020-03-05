package com.prachi;

/**
 * @author prachi
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        //good solution but time complexity is more
        // while(k != 0){
        //     int fisrtElement = nums[nums.length - 1];
        //     for (int i = nums.length-1; i > 0; i--){
        //         nums[i] = nums[i-1];
        //     }
        //     nums[0] = fisrtElement;
        //     k--;
        // }
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
