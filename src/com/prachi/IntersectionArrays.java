package com.prachi;

import java.util.Arrays;

/**
 * @author prachi
 */
public class IntersectionArrays {


    public static void main(String[] args) {
        IntersectionArrays intersectionArrays = new IntersectionArrays();
        int a[] = intersectionArrays.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});

        System.out.println(Arrays.toString(a));
    }

    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int tempArray[] = new int[nums1.length];


        int k = 0;
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                tempArray[k] = nums1[i];
                i++;
                j++;
                k++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int resultArray[] = new int[k];

        for (int a = 0; a < k; a++) {
            resultArray[a] = tempArray[a];
        }

        return resultArray;
    }
}

