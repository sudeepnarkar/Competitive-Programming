package Leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {

    @Test
    public void test1() {
        assertEquals(2, new MissingNumber().missingNumber(new int[]{3,0,1}));
    }

    @Test
    public void test2() {
        assertEquals(8, new MissingNumber().missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}