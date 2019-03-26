package Leetcode;


/*
        Given an array of integers A sorted in non-decreasing order
        return an array of the squares of each number, also in sorted non-decreasing order.

        Example 1:

        Input: [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
        Example 2:

        Input: [-7,-3,2,3,11]
        Output: [4,9,9,49,121]*/

class SquaresOfSortedArray {
    public int[] sortedSquares(int[] A) {
        int i = 0;
        int j = A.length-1;
        int [] res = new int[A.length];
        for(int z = A.length-1;z>=0;z--){
            if(Math.abs(A[j])>Math.abs(A[i])){
                res[z] = A[j]*A[j];
                j--;
            }else{
                res[z] = A[i]*A[i];
                i++;
            }
        }
        return res;
    }
}
