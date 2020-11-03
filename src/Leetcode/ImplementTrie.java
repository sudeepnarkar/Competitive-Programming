package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 11/2/2020, Mon, 8:45 PM
 **/

//https://leetcode.com/problems/implement-trie-prefix-tree
public class ImplementTrie {

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isWord;

        public TrieNode() {
            this.children = new HashMap<>();
            this.isWord = false;
        }
    }

    TrieNode root;

    public ImplementTrie() {
        root = new TrieNode();
    }


    /**
     *
     * Implement a trie with insert, search, and startsWith methods.
     *
     * Example:
     *
     * Trie trie = new Trie();
     *
     * trie.insert("apple");
     * trie.search("apple");   // returns true
     * trie.search("app");     // returns false
     * trie.startsWith("app"); // returns true
     * trie.insert("app");
     * trie.search("app");     // returns true
     */

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
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
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if (node == null) {
                return false;
            }
            curr = node;
        }
        return curr.isWord;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            TrieNode node = curr.children.get(ch);
            if (node == null) {
                return false;
            }
            curr = node;
        }
        return true;
    }

    public static void main(String[] args) {

        ImplementTrie obj = new ImplementTrie();
        String word = "test";
        obj.insert(word);
        boolean param_2 = obj.search(word);
        boolean param_3 = obj.startsWith("te");
        boolean param_4 = obj.startsWith("aa");
        System.out.println(param_2); // true
        System.out.println(param_3); // true
        System.out.println(param_4); // false
    }
}
