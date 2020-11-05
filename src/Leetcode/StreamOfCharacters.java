package Leetcode;

import org.junit.Assert;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 11/4/2020, Wed, 8:42 PM
 **/

//https://leetcode.com/problems/stream-of-characters
public class StreamOfCharacters {
    static class TrieNode {
        Map<Character, TrieNode> children;
        boolean isWord;

        public TrieNode() {
            children = new HashMap<>();
            isWord = false;
        }

    }

    LinkedList<Character> queue = new LinkedList<>();
    TrieNode root;

    public StreamOfCharacters(String[] words) {
        root = new TrieNode();
        for (int i = 0; i < words.length; i++) {
            insertWord(words[i]);
        }
    }

    /**
     * Insert words after reverse in trie
     *
     * @param w
     */
    public void insertWord(String w) {
        String word = new StringBuilder(w).reverse().toString();
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
     * As the words in trie are reversed, add search query letters in
     * the front of the queue, traverse the trie and return true
     * if word is found
     */
    public boolean query(char letter) {
        queue.addFirst(letter);
        TrieNode curr = root;
        for (char c : queue) {
            TrieNode node = curr.children.get(c);
            if (node == null) {
                return false;
            }
            curr = node;
            if (curr.isWord) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"cd", "f", "kl"};
        StreamOfCharacters streamChecker = new StreamOfCharacters(words);
        Assert.assertEquals(streamChecker.query('a'), false);
        Assert.assertEquals(streamChecker.query('b'), false);
        Assert.assertEquals(streamChecker.query('c'), false);
        Assert.assertEquals(streamChecker.query('d'), true); //because 'cd' is in the wordlist
        Assert.assertEquals(streamChecker.query('e'), false);
        Assert.assertEquals(streamChecker.query('f'), true); // because 'f' is in the wordlist
        Assert.assertEquals(streamChecker.query('g'), false);
        Assert.assertEquals(streamChecker.query('h'), false);
        Assert.assertEquals(streamChecker.query('i'), false);
        Assert.assertEquals(streamChecker.query('k'), false);
        Assert.assertEquals(streamChecker.query('l'), true); //return true because 'kl' is in the wordlist
    }
}
