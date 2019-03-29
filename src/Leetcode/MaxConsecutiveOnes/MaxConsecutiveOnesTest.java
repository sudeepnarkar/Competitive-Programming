package Leetcode.MaxConsecutiveOnes;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxConsecutiveOnesTest {

    @Test
    public void test1() {
        assertEquals(3, new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }

    @Test
    public void test2() {
        assertEquals(2, new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1,1}));
    }

    @Test
    public void test3() {
        assertEquals(3, new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1,0,1,1,1,0,1,1,1}));
    }
}