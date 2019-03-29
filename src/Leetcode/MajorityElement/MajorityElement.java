package Leetcode.MajorityElement;

import java.util.HashMap;

class MajorityElement {


    /*Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

    You may assume that the array is non-empty and the majority element always exist in the array.

    Example 1:

    Input: [3,2,3]
    Output: 3
    Example 2:

    Input: [2,2,1,1,1,2,2]
    Output: 2*/


    public static int majorityElement(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length/2;
        int num = 0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])==n){
                    num = nums[i];
                    break;
                }else{
                    map.put(nums[i],map.get(nums[i])+1);
                }
            }else{
                map.put(nums[i],1);
            }
        }
        return num;
    }

}
