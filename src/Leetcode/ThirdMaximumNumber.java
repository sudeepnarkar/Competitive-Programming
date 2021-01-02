package Leetcode;

import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 1/2/2021, Sat, 11:34 AM
 **/

//https://leetcode.com/problems/third-maximum-number
public class ThirdMaximumNumber {

    /**
     * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).
     * <p>
     * Example 1:
     * Input: [3, 2, 1]
     * <p>
     * Output: 1
     * <p>
     * Explanation: The third maximum is 1.
     * Example 2:
     * Input: [1, 2]
     * <p>
     * Output: 2
     * <p>
     * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
     * Example 3:
     * Input: [2, 2, 3, 1]
     * <p>
     * Output: 1
     * <p>
     * Explanation: Note that the third maximum here means the third maximum distinct number.
     * Both numbers with value 2 are both considered as second maximum.
     *
     * @param nums
     * @return the third maximum number in this array. If it does not exist, return the maximum number.
     */


    // Time Complexity = O(N), where N is the length of nums
    // Space Complexity = O(1),
    public int thirdMaxSolution1(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for(Integer n : nums){
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if(max1 == null || n>max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            }else if (max2 == null || n>max2){
                max3 = max2;
                max2 = n;
            }else if (max3 == null ||n>max3){
                max3 = n;
            }
        }
        // Find the third max, if not present, find the maximum
        return max3!= null?max3:max1!=null?max1:0;
    }

    // Time Complexity = O(NlogN), where N is the length of nums and it is NLogN as the heap does log n operation for n times.
    // Space Complexity = O(n), where N is the length of nums
    public int thirdMaxSolution2(int[] nums) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (!minHeap.contains(n)) {
                minHeap.add(n);
            }
            if (n > max) {
                max = n;
            }
            if (minHeap.size() > 3) {
                minHeap.poll();
            }

        }
        return minHeap.size() == 3 ? minHeap.peek() : max;
    }
}
