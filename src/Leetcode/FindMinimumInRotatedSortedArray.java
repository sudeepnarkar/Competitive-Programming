package Leetcode;

public class FindMinimumInRotatedSortedArray {
/*
    Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

            (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

    Find the minimum element.

    You may assume no duplicate exists in the array.

            Example 1:

    Input: [3,4,5,1,2]
    Output: 1
    Example 2:

    Input: [4,5,6,7,0,1,2]
    Output: 0*/

    public int findMin(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        int res = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                res = nums[i+1];
                return res;
            }
        }
        return nums[0];
    }
}
