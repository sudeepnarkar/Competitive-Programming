package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

   /* Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

    Find all the elements that appear twice in this array.

    Could you do it without extra space and in O(n) runtime?

    Example:
    Input:
            [4,3,2,7,8,2,3,1]

    Output:
            [2,3]*/


    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int index = Math.abs(nums[i]);
            if(nums[index-1]<0){
                list.add(index);
            }else{
                nums[index-1] = -nums[index-1];
            }
        }
        return list;
    }
}
