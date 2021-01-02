package Leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 1/2/2021, Sat, 1:06 PM
 **/

//https://leetcode.com/problems/largest-unique-number
public class LargestUniqueNumber {

    /**
     * Given an array of integers A, return the largest integer that only occurs once.
     * <p>
     * If no integer occurs once, return -1.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: [5,7,3,9,4,9,8,3,1]
     * Output: 8
     * Explanation:
     * The maximum integer in the array is 9 but it is repeated. The number 8 occurs only once, so it's the answer.
     * Example 2:
     * <p>
     * Input: [9,9,8,8]
     * Output: -1
     * Explanation:
     * There is no number that occurs only once.
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= A.length <= 2000
     * 0 <= A[i] <= 1000
     *
     * @param A
     * @return return the largest integer that only occurs once.
     */

    // Time Complexity = 0(N), where N is the length of the array
    // Space Complexity = 0(1), constant space
    public int largestUniqueNumber(int[] A) {

        /**
         *  Using the constraints :
         *  1 <= A.length <= 2000
         *   0 <= A[i] <= 1000
         */

        int[] arr = new int[1001];
        for (int n : A) {
            arr[n]++;
        }

        for (int i = 1000; i >= 0; i--) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * For bigger inputs, the solution can be modified as follows
     *
     * @param A
     * @return return the largest integer that only occurs once.
     */

    // Time Complexity = 0(NLogN), where N is the length of the array and LogN operation is done N time by the heap
    // Space Complexity = 0(N), where the maximum size of heap and the set is N
    public int largestUniqueNumberForBiggerInputs(int[] A) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((n1, n2) -> n2 - n1);
        HashSet<Integer> set = new HashSet<>();
        for (int n : A) {
            if (set.contains(n)) {
                if (maxHeap.contains(n)) {
                    maxHeap.remove(n);
                }
                continue;
            } else {
                maxHeap.add(n);
            }
            set.add(n);
        }
        return maxHeap.size() == 0 ? -1 : maxHeap.peek();
    }
}
