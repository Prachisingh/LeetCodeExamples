package com.prachi;

import java.util.HashSet;

/**
 * @author prachi
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }


    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        System.out.println(containsDuplicate.containsDuplicate(new int[]{1, 5, 5, 3, 2, 4}));
    }

}
