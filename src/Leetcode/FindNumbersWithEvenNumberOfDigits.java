package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 11/26/2020, Thu, 7:05 AM
 **/

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindNumbersWithEvenNumberOfDigits {


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
     *
     * @param nums
     * @return count of numbers with even digits
     */

    // Time complexity = (N*M) where N is the number of digits and M is their average length.
    // Space complexity = 0(1) No extra space used.
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
