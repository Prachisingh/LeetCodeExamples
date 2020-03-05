package com.prachi;

/**
 * @author prachi
 */
public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 3};
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        System.out.println("Length of modified stack is  " + removeDuplicate.removeDuplicates(arr));

    }

    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }
        return index;
    }
}
