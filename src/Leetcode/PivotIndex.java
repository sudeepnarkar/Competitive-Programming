package Leetcode;


//https://leetcode.com/problems/find-pivot-index
public class PivotIndex {

    /**
     * Given an array of integers nums, calculate the pivot index of this array.
     * <p>
     * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
     * <p>
     * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
     * <p>
     * Return the leftmost pivot index. If no such index exists, return -1.
     *
     * @param nums
     * @return the leftmost pivot index. If no such index exists, return -1.
     */

    //Time Complexity = O(N), where N is the length of nums
    //Space Complexity = O(1)
    public int pivotIndex(int[] nums) {

        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currSum == ((sum - nums[i]) - currSum)) {
                return i;
            }
            currSum += nums[i];
        }

        return -1;
    }

}
