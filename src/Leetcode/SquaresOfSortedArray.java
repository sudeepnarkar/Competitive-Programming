package Leetcode;

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
