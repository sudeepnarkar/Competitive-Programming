package DataStructures.Trie;

import com.sun.org.apache.xml.internal.utils.Trie;
import org.junit.Assert;

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
            return false;
        }
        return searchRec(node, word, index + 1);
    }

    boolean isDeletedSuccessfully;

    public boolean deleteWord(String word) {
        isDeletedSuccessfully = false;
        deleteWordRecursive(root, word, 0);
        return isDeletedSuccessfully;
    }

    private boolean deleteWordRecursive(TrieNode root, String word, int index) {

        if (word.length() == index) {
            // check if the word to delete exists
            if (root.isWord == false) {
                return false;
            }
            // word can be deleted successfully
            isDeletedSuccessfully = true;
            root.isWord = false;
            // check if the node is candidate for deletion
            return root.children.size() == 0;
        }

        char ch = word.charAt(index);
        TrieNode node = root.children.get(ch);

        // A char of the word does not exist. Word cannot be deleted
        if (node == null) {
            return false;
        }

        boolean deleteNode = deleteWordRecursive(node, word, index + 1);

        if (deleteNode) {
            // delete the child node with no children
            root.children.remove(ch);
            // return to check the current node should be deleted
            return root.children.size() == 0;
        }

        return false;
    }


    public static void main(String[] args) {

        TrieUsingHashMap trieUsingHashMap = new TrieUsingHashMap();
        trieUsingHashMap.insertWordRecursive("abc");
        trieUsingHashMap.insertWordRecursive("abcde");

        Assert.assertEquals(trieUsingHashMap.searchRecursive("abc"), true);
        Assert.assertEquals(trieUsingHashMap.searchRecursive("abcd"), false);
        Assert.assertEquals(trieUsingHashMap.deleteWord("a"), false);
        Assert.assertEquals(trieUsingHashMap.deleteWord("abc"), true);
        Assert.assertEquals(trieUsingHashMap.deleteWord("b"), false);
    }
}
