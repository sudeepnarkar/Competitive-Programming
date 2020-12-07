package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 12/7/20, Mon, 7:01 PM
 **/
//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptItself {

    /**
     * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
     * <p>
     * Example:
     * <p>
     * Input:  [1,2,3,4]
     * Output: [24,12,8,6]
     *
     * @param nums
     * @return array representing Product of Array Except Self
     */
    // Time Complexity = O (N) => O(3N) amortized to O(N)
    // Space Complexity = O (N)  => O(3N) amortized to O(N)
    public int[] productExceptSelf(int[] nums) {

        int[] arrProductAhead = new int[nums.length];
        int[] arrProductBack = new int[nums.length];

        arrProductBack[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            arrProductBack[i] = arrProductBack[i - 1] * nums[i - 1];
        }

        arrProductAhead[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            arrProductAhead[i] = arrProductAhead[i + 1] * nums[i + 1];
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = arrProductBack[i] * arrProductAhead[i];
        }
        return res;
    }
}
