package Leetcode.ToLowerCase;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToLowerCaseTest {

    @org.junit.Test
    public void testWithAllUpperCaseInput() {
        assertEquals("dave",new ToLowerCase().toLowerCase("DAVE"));
    }

    @Test
    public void testWithMixedCaseInput() {
        assertEquals("dave",new ToLowerCase().toLowerCase("DAvE"));
    }
}

