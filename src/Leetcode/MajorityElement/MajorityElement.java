package Leetcode.MajorityElement;

import java.util.HashMap;

//https://leetcode.com/problems/majority-element
class MajorityElement {

    /*Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

    You may assume that the array is non-empty and the majority element always exist in the array.

    Example 1:

    Input: [3,2,3]
    Output: 3
    Example 2:

    Input: [2,2,1,1,1,2,2]
    Output: 2*/

    public int majorityElement(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length / 2;
        int majorityElem = -1;
        for (int n : nums) {
            if (map.containsKey(n)) {
                if (map.get(n) == len) {
                    majorityElem = n;
                    break;
                }
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        //majority is guaranteed to be present in the input, so this line will never be reached.
        return majorityElem;
    }
}
