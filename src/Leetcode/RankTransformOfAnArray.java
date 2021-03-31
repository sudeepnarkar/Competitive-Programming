package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 3/31/21, Wed, 8:36 AM
 **/

//https://leetcode.com/problems/rank-transform-of-an-array
public class RankTransformOfAnArray {

    /**
     * Given an array of integers arr, replace each element with its rank.
     * <p>
     * The rank represents how large the element is. The rank has the following rules:
     * <p>
     * Rank is an integer starting from 1.
     * The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
     * Rank should be as small as possible.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: arr = [40,10,20,30]
     * Output: [4,1,2,3]
     * Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
     * Example 2:
     * <p>
     * Input: arr = [100,100,100]
     * Output: [1,1,1]
     * Explanation: Same elements share the same rank.
     * Example 3:
     * <p>
     * Input: arr = [37,12,28,9,100,56,80,5,12]
     * Output: [5,3,4,2,8,6,7,1,3]
     *
     * @param arr
     * @return an array with the rank of each element
     */

    //Time Complexity = O(N), where N is the size of arr
    //Space Complexity = O(N), where N is the size of arr
    public int[] arrayRankTransform(int[] arr) {

        if (arr == null || arr.length == 0) {
            return new int[]{};
        }
        int[] resArr = arr.clone();
        //sort the clone array to get rank
        Arrays.sort(resArr);
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < resArr.length; i++) {
            //insert element as key and rank as value in the map
            rankMap.putIfAbsent(resArr[i], rankMap.size() + 1);
        }

        //reuse the resArr to insert ranks for elements in arr
        for (int i = 0; i < arr.length; i++) {
            resArr[i] = rankMap.get(arr[i]);
        }
        return resArr;
    }
}
