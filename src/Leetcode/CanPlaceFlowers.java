package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 3/26/21, Fri, 3:51 PM
 **/

//https://leetcode.com/problems/can-place-flowers
public class CanPlaceFlowers {

    /**
     * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
     * <p>
     * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: flowerbed = [1,0,0,0,1], n = 1
     * Output: true
     * Example 2:
     * <p>
     * Input: flowerbed = [1,0,0,0,1], n = 2
     * Output: false
     *
     * @param flowerbed
     * @param n
     * @return if n flowers can be placed with the given arrangement
     */

    //Time Complexity = O(N), where N is the length of flower bed
    //Space Complexity = O(1)
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int len = flowerbed.length;
        for (int i = 0; i < flowerbed.length; i++) {
            //check if current item is 0 and check if previous and next elements are 0
            if ((flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)) && ((i == len - 1) || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
