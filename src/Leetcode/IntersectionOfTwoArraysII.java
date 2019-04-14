package Leetcode;

import java.util.ArrayList;

public class IntersectionOfTwoArraysII {



    /*Given two arrays, write a function to compute their intersection.

            Example 1:

    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2,2]
    Example 2:

    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    Output: [4,9]
    Note:

    Each element in the result should appear as many times as it shows in both arrays.
    The result can be in any order.
*/


    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int num:nums1){
            list1.add(num);
        }
        for(int num:nums2){
            if(list1.contains(num)){
                res.add(num);
                list1.remove((Integer)num);
            }
        }
        int size = res.size();
        int [] nums = new int[size];

        for(int i=0;i<size;i++){
            nums[i] = res.get(i);
        }
        return nums;
    }
}
