package Leetcode.FindCommonCharacters;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FindCommonCharactersTest {

    @Test
    public void commonCharsTest1() {
        String [] input = new String[]{"bella","label","roller"};
        String [] expected = new String[]{"e","l","l"};
        List<String> actual = new FindCommonCharacters().findCommonChars(input);
        String []res  = new String[actual.size()];
        for (int i = 0; i <actual.size() ; i++) {
            res[i] = actual.get(i);
        }
        assertEquals(expected,res);
    }

    @Test
    public void commonCharsTest2() {
        String [] input = new String[]{"cool","lock","cook"};
        String [] expected = new String[]{"c","o"};
        List<String> actual = new FindCommonCharacters().findCommonChars(input);
        String []res  = new String[actual.size()];
        for (int i = 0; i <actual.size() ; i++) {
            res[i] = actual.get(i);
        }
        assertEquals(expected,res);
    }
}
