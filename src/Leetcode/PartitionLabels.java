package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sudeep Narkar
 * @since : 10/28/2020, Wed, 10:20 PM
 **/


//https://leetcode.com/problems/partition-labels/
public class PartitionLabels {


    /**
     * A string S of lowercase English letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.
     * <p>
     * Example 1:
     * <p>
     * Input: S = "ababcbacadefegdehijhklij"
     * Output: [9,7,8]
     * Explanation:
     * The partition is "ababcbaca", "defegde", "hijhklij".
     * This is a partition so that each letter appears in at most one part.
     * A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
     */

    public List<Integer> partitionLabels(String S) {

        char[] arr = S.toCharArray();
        int[] lastIndex = new int[26];
        // keep track of the last occurrence index for the letter
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            lastIndex[c - 'a'] = i;
        }
        List<Integer> list = new ArrayList<>();
        int j = 0;
        int partition = -1;
        for (int i = 0; i < arr.length; i++) {
            j = Math.max(lastIndex[arr[i] - 'a'], j);
            //check if this can be a partition
            if (i == j) {
                list.add(i - partition);
                partition = i;
            }
        }
        return list;
    }
}