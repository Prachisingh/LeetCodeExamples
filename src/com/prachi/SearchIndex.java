package com.prachi;

/**
 * @author prachi
 */
public class SearchIndex {

    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 7, 14};

        System.out.println(searchInsert(a,5));

    }
    private static int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                index = i;
                break;
            }
            else if(target < nums[i]){
                index = i;
                break;
            }
        }

        if(target > nums[nums.length-1]){
            index = nums.length;
        }

        return index;
    }
}
