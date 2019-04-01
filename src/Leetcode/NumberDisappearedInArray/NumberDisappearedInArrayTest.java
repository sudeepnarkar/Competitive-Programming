package Leetcode.NumberDisappearedInArray;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NumberDisappearedInArrayTest {

    @Test
    public void findDisappearedNumbers() {

        int [] nums = new int[] {4,3,2,7,8,2,3,1};
        List<Integer> list = new NumberDisappearedInArray().findDisappearedNumbers(nums);
        int [] expectedRes = new int[list.size()];

        for(int i =0;i<list.size();i++){
            expectedRes[i] = list.get(i);
        }
        assertArrayEquals(new int[]{5,6},expectedRes);
    }
}