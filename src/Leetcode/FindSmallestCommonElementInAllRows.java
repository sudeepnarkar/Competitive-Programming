package Leetcode;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author : Sudeep Narkar
 * @since : 3/24/21, Wed, 8:52 PM
 **/

//https://leetcode.com/problems/find-smallest-common-element-in-all-rows
public class FindSmallestCommonElementInAllRows {

    /**
     * Given a matrix mat where every row is sorted in strictly increasing order, return the smallest common element in all rows.
     * <p>
     * If there is no common element, return -1.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: mat = [[1,2,3,4,5],[2,4,5,8,10],[3,5,7,9,11],[1,3,5,7,9]]
     * Output: 5
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= mat.length, mat[i].length <= 500
     * 1 <= mat[i][j] <= 10^4
     * mat[i] is sorted in strictly increasing order.
     *
     * @param mat
     * @return the smallest common element in all rows or -1
     */

    //Time Complexity = O(MN), where M and N are rowLen and ColLen respectively
    //Space Complexity = O(MN), where M and N are rowLen and ColLen respectively
    public int smallestCommonElement(int[][] mat) {

        Map<Integer, Integer> map = new TreeMap<>();
        int rowNum = mat.length;

        //count the frequency of each element in row
        for (int[] row : mat) {
            for (int i = 0; i < row.length; i++) {
                map.put(row[i], map.getOrDefault(row[i], 0) + 1);
            }
        }

        //Find the first element in the tree map that is equal to rowNum
        for (int key : map.keySet()) {
            if (map.get(key) == rowNum) {
                return key;
            }

        }
        return -1;
    }
}
