package com.prachi;

import java.util.HashMap;

/**
 * @author prachi
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0; i<nums.length; i++){
            int difference = target - nums[i];
            if(map.containsKey(difference)){
                return new int[] {i, map.get(difference)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
