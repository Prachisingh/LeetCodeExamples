package com.prachi;
import java.util.Arrays;

/**
 * @author prachi
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i<nums.length-1; i++ ){
                if(nums[i] == nums[i+1]){
                    return true;
                }
        }
        return false;
    }


    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,5,5,3,2,4}));
    }

}
