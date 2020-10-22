package Leetcode;

/**
 * @author : Sudeep Narkar
 * @version  : 10/21/2020, Wed, 11:16 PM
 **/

//https://leetcode.com/problems/single-number/
public class SingleNumber {

    /*Given a non-empty array of integers, every element appears twice except for one. Find that single one.

    Note:

    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

    Example 1:

    Input: [2,2,1]
    Output: 1
    Example 2:

    Input: [4,1,2,1,2]
    Output: 4*/

    public int singleNumber(int[] nums) {

        int num = 0;
        for (int n : nums) {
            num ^= n;
        }
        return num;
    }
}
