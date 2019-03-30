package Leetcode.IsPalindrome;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class IsPalindromeTest {

    @Test
    public void isPalindrome() {

        int [] arr = new int[]{1,2,2,1};
        int len = arr.length;
        for(int i = 0,  j = len-1; i<len && j!=0;i++,j--){
            assertEquals(arr[i],arr[j]);
        }
    }
}