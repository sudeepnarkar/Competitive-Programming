package Leetcode.MaxSoFar;

public class MaxSoFar {

    /*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

    Example:

    Input: [-2,1,-3,4,-1,2,1,-5,4],
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
*/

    public int maxSubArray(int[] nums) {

        int maxSoFar = nums[0];
        int max = nums[0];
        for (int i=1;i<nums.length;i++){
            maxSoFar = Math.max(maxSoFar+nums[i],nums[i]);
            max = Math.max(maxSoFar,max);
        }
        return max;
    }
}
