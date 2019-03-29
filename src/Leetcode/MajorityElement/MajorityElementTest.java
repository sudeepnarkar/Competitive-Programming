package Leetcode.MajorityElement;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MajorityElementTest {

    @Test
    public void test1() {
        assertEquals(3, new MajorityElement().majorityElement(new int[]{3, 2, 3}));
    }

    @Test
    public void test2() {
        assertEquals(2, new MajorityElement().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
