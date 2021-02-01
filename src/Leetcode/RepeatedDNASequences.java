package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 2/1/2021, Mon, 5:49 PM
 **/

//https://leetcode.com/problems/repeated-dna-sequences
public class RepeatedDNASequences {


    /**
     * All DNA is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T', for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.
     * <p>
     * Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
     * Output: ["AAAAACCCCC","CCCCCAAAAA"]
     * <p>
     * Example 2:
     * <p>
     * Input: s = "AAAAAAAAAAAAA"
     * Output: ["AAAAAAAAAA"]
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= s.length <= 105
     * s[i] is 'A', 'C', 'G', or 'T'.
     *
     * @param s
     * @return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
     */

    //Time Complexity = O(N), where N is the length of s
    //Time Complexity = O(N), where N is the length of s
    public List<String> findRepeatedDnaSequences(String s) {

        Map<String, Integer> seenMap = new HashMap<>();
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i + 10 <= s.length()) {
            String subStr = s.substring(i, i + 10);
            seenMap.put(subStr, seenMap.getOrDefault(subStr, 0) + 1);
            if (seenMap.get(subStr) == 2) {
                res.add(subStr);
            }
            i++;
        }
        return res;
    }
}
