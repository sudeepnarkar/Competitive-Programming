package Leetcode.SquaresOfSortedArray;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SquaresOfSortedArrayTest {

    @Test
    public void test1() {
        assertTrue(Arrays.equals(new int[]{0,1,9,16,100}, new SquaresOfSortedArray().sortedSquares(new int[]{-4,-1,0,3,10})));
    }

    @Test
    public void test2() {
        assertTrue(Arrays.equals(new int[]{4,9,9,49,121}, new SquaresOfSortedArray().sortedSquares(new int[]{-7,-3,2,3,11})));
    }
}