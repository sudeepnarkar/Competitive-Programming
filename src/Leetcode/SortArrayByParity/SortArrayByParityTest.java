package Leetcode.SortArrayByParity;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortArrayByParityTest {

    //since the solution can accept multiple correct outputs
    @Test
    public void test1() {
        assertTrue(Arrays.equals(new int[]{2, 4, 1, 3}, new SortArrayByParity().sortArrayByParity(new int[]{3,1,2,4})) ||
               Arrays.equals(new int[]{2, 4, 1, 3}, new SortArrayByParity().sortArrayByParity(new int[]{3,1,2,4})));
    }
}