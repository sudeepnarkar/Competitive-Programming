package Leetcode;

import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 12/13/2020, Sun, 2:00 PM
 **/


//https://leetcode.com/problems/nested-list-weight-sum
public class NestedListWeightSum {


    /**
     * Given a nested list of integers, return the sum of all integers in the list weighted by their depth.
     * <p>
     * Each element is either an integer, or a list -- whose elements may also be integers or other lists.
     * <p>
     * Example 1:
     * <p>
     * Input: [[1,1],2,[1,1]]
     * Output: 10
     * Explanation: Four 1's at depth 2, one 2 at depth 1.
     * Example 2:
     * <p>
     * Input: [1,[4,[6]]]
     * Output: 27
     * Explanation: One 1 at depth 1, one 4 at depth 2, and one 6 at depth 3; 1 + 4*2 + 6*3 = 27.
     *
     * @param nestedList
     * @return Nested List Weight Sum
     */

    // Time Complexity = 0(N) where N is the total number of nested elements in the input list.
    // Space Complexity = O(D) where D is the maximum depth as that will the max recursion stack height
    public int depthSum(List<NestedInteger> nestedList) {

        int depth = 1;
        return depthSumUtil(nestedList, depth);
    }

    public int depthSumUtil(List<NestedInteger> nestedList, int depth) {

        int sum = 0;
        for (NestedInteger list : nestedList) {
            sum += list.isInteger() ? list.getInteger() * depth : depthSumUtil(list.getList(), depth + 1);
        }
        return sum;
    }
}

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 * // Constructor initializes an empty nested list.
 * public NestedInteger();
 * <p>
 * // Constructor initializes a single integer.
 * public NestedInteger(int value);
 * <p>
 * // @return true if this NestedInteger holds a single integer, rather than a nested list.
 * public boolean isInteger();
 * <p>
 * // @return the single integer that this NestedInteger holds, if it holds a single integer
 * // Return null if this NestedInteger holds a nested list
 * public Integer getInteger();
 * <p>
 * // Set this NestedInteger to hold a single integer.
 * public void setInteger(int value);
 * <p>
 * // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 * public void add(NestedInteger ni);
 * <p>
 * // @return the nested list that this NestedInteger holds, if it holds a nested list
 * // Return null if this NestedInteger holds a single integer
 * public List<NestedInteger> getList();
 * }
 */
