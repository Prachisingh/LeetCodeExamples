package com.prachi.improved;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author prachi
 */
public class SingleNumber {

    public int singleNumberLeetCodeApp(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }

        for (int j : set) {
            return j;
        }

        return -1;

    }


    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = -1;
        int count;
        int length = nums.length;
        boolean noResult = true;
        for (int i = 0; i < nums.length - 1; ) {
            count = 1;
            if (nums[i] == nums[i + 1]) {
                count++;
            }
            if (count == 2) {
                i = i + 2;
                continue;
            } else {
                noResult = false;
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
        System.out.println(singleNumber.singleNumberLeetCodeApp(new int[]{1, 3, 1, 4, 3}));
    }

}
