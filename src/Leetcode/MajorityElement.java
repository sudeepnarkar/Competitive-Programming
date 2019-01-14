package Leetcode;

import java.util.HashMap;

class MajorityElement {
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

    public static void main(String[] args) {

        int [] arr = {1};
        System.out.println(majorityElement(arr));

    }
}
