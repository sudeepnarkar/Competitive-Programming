package DataStructures.Trie;

import com.sun.org.apache.xml.internal.utils.Trie;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 11/2/2020, Mon, 8:36 AM
 **/

public class TrieUsingHashMap {

    static class TrieNode {
        Map<Character, TrieNode> children;
        boolean isWord;

        public TrieNode() {
            this.children = new HashMap<>();
            this.isWord = false;
        }
    }

    TrieNode root;

    public TrieUsingHashMap() {
        root = new TrieNode();
    }

    public void insertWord(String word) {
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

    public void insertWordRecursive(String word) {
        insertWordRec(root, word, 0);
    }

    public void insertWordRec(TrieNode root, String word, int index) {
        if (word.length() == index) {
            root.isWord = true;
            return;
        }

        char ch = word.charAt(index);
        TrieNode node = root.children.get(ch);
        if (node == null) {
            node = new TrieNode();
            root.children.put(ch, node);
        }
        insertWordRec(node, word, index + 1);
    }

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

    public boolean searchRecursive(String word) {
        return searchRec(root, word, 0);
    }

    public boolean searchRec(TrieNode root, String word, int index) {
        if (word.length() == index) {
            return root.isWord;
        }
        char ch = word.charAt(index);
        TrieNode node = root.children.get(ch);
        if (node == null) {
            node = new TrieNode();
            root.children.put(ch, node);
        }
        return searchRec(node, word, index + 1);
    }


    public static void main(String[] args) {

        TrieUsingHashMap trieUsingHashMap = new TrieUsingHashMap();
        trieUsingHashMap.insertWordRecursive("ab");
        trieUsingHashMap.insertWordRecursive("abc");
        System.out.println(trieUsingHashMap.searchRecursive("abc")); // true
        System.out.println(trieUsingHashMap.searchRecursive("abcd")); // false

    }
}
