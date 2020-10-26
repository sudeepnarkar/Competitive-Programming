package Leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Sudeep Narkar
 * @since : 10/26/2020, Mon, 4:17 PM
 **/

//https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {

    /**
     * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
     * <p>
     * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
     * <p>
     * Example 1:
     * <p>
     * Input: J = "aA", S = "aAAbbbb"
     * Output: 3
     * Example 2:
     * <p>
     * Input: J = "z", S = "ZZ"
     * Output: 0
     */

    public int numJewelsInStones(String J, String S) {

        int numJewels = 0;
        Set<Character> set = new HashSet<>();

        for (char c : J.toCharArray()) {
            set.add(c);
        }

        for (char c : S.toCharArray()) {
            if (set.contains(c)) {
                numJewels++;
            }
        }
        return numJewels;
    }
}