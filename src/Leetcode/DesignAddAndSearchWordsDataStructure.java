package Leetcode;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 11/3/2020, Tue, 12:46 PM
 **/

//https://leetcode.com/problems/design-add-and-search-words-data-structure
public class DesignAddAndSearchWordsDataStructure {

    /**
     *
     * Design a data structure that supports adding new words and finding if a string matches any previously added string.
     *
     * Implement the WordDictionary class:
     *
     *     WordDictionary() Initializes the object.
     *     void addWord(word) Adds word to the data structure, it can be matched later.
     *     bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.
     *
     *
     *
     * Example:
     *
     * Input
     * ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
     * [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
     * Output
     * [null,null,null,null,false,true,true,true]
     *
     * Explanation
     * WordDictionary wordDictionary = new WordDictionary();
     * wordDictionary.addWord("bad");
     * wordDictionary.addWord("dad");
     * wordDictionary.addWord("mad");
     * wordDictionary.search("pad"); // return False
     * wordDictionary.search("bad"); // return True
     * wordDictionary.search(".ad"); // return True
     * wordDictionary.search("b.."); // return True
     */


    /**
     * Initialize your data structure here.
     */
    static class TrieNode {
        Map<Character, TrieNode> children;
        boolean isWord;

        TrieNode() {
            children = new HashMap<>();
            isWord = false;
        }
    }

    TrieNode root;

    public DesignAddAndSearchWordsDataStructure() {
        root = new TrieNode();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                curr.children.put(ch, node);
            }
            curr = node;
        }
        curr.isWord = true;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return searchRec(root, word, 0);
    }

    public boolean searchRec(TrieNode root, String word, int index) {

        if (word.length() == index) {
            if (root.isWord == false) {
                return false;
            }
            return true;
        }

        char ch = word.charAt(index);
        if (ch == '.') {
            for (TrieNode node : root.children.values()) {
                // backtrack and check if any paths return true
                boolean res = searchRec(node, word, index + 1);
                // If word is present, return true
                if (res) {
                    return true;
                }
            }
        }
        TrieNode node = root.children.get(ch);
        // If char not in map, return false
        if (node == null) {
            return false;
        }
        return searchRec(node, word, index + 1);
    }

    public static void main(String[] args) {

        DesignAddAndSearchWordsDataStructure obj = new DesignAddAndSearchWordsDataStructure();
        obj.addWord("at");
        obj.addWord("and");
        obj.addWord("an");
        obj.addWord("add");
        obj.addWord("bat");
        Assert.assertEquals(obj.search(""), false);
        Assert.assertEquals(obj.search(".at"), true);
        Assert.assertEquals((obj.search("a")), false);
        Assert.assertEquals(obj.search(".at"), true);
        Assert.assertEquals(obj.search("an."), true);
        Assert.assertEquals(obj.search("a.d."), false);
        Assert.assertEquals(obj.search("b."), false);
        Assert.assertEquals(obj.search("a.d"), true);
        Assert.assertEquals(obj.search("."), false);
        Assert.assertEquals(obj.search(".d."), true);
    }
}
