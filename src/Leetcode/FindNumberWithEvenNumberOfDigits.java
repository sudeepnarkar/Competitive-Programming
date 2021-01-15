package Leetcode;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits
public class FindNumberWithEvenNumberOfDigits {


    /**
     * Given an array nums of integers, return how many of them contain an even number of digits.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [12,345,2,6,7896]
     * Output: 2
     * Explanation:
     * 12 contains 2 digits (even number of digits).
     * 345 contains 3 digits (odd number of digits).
     * 2 contains 1 digit (odd number of digits).
     * 6 contains 1 digit (odd number of digits).
     * 7896 contains 4 digits (even number of digits).
     * Therefore only 12 and 7896 contain an even number of digits.
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [555,901,482,1771]
     * Output: 1
     * Explanation:
     * Only 1771 contains an even number of digits.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 500
     * 1 <= nums[i] <= 10^5
     *
     * @param nums
     * @return how many of them contain an even number of digits.
     */

    //Time Complexity = O(N*M), where N is the length of nums and M is the average number of digits in the elements in nums
    //Space Complexity = O(1)
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (countEvenDigits(num)) {
                count++;
            }
        }

        return count;
    }

    public boolean countEvenDigits(int num) {

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }

        return (count % 2) == 0;
    }
}
