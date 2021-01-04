package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 1/3/2021, Sun, 9:40 PM
 **/

//https://leetcode.com/problems/insert-delete-getrandom-o1
public class InsertDeleteGetRandom {

    List<Integer> nums;
    Map<Integer, Integer> map;
    java.util.Random rand = new java.util.Random();

    /**
     * Implement the RandomizedSet class:
     *
     * bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
     * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
     * int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
     * Follow up: Could you implement the functions of the class with each function works in average O(1) time?
     *
     *
     *
     * Example 1:
     *
     * Input
     * ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
     * [[], [1], [2], [2], [], [1], [2], []]
     * Output
     * [null, true, false, true, 2, true, false, 2]
     *
     * Explanation
     * RandomizedSet randomizedSet = new RandomizedSet();
     * randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
     * randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
     * randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
     * randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
     * randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
     * randomizedSet.insert(2); // 2 was already in the set, so return false.
     * randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.
     *
     *
     * Constraints:
     *
     * -231 <= val <= 231 - 1
     * At most 105 calls will be made to insert, remove, and getRandom.
     * There will be at least one element in the data structure when getRandom is called.
     *
     *
     */

    /**
     * Initialize your data structure here.
     */
    // Time Complexity = O(1)
    // Space Complexity = O(N), where N is the values to be removed or inserted
    public InsertDeleteGetRandom() {
        nums = new ArrayList<>();
        map = new HashMap<>();

    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, nums.size());
        nums.add(val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int size = nums.size();
        if (index < nums.size() - 1) {
            int n = nums.get(size - 1);
            nums.set(index, n);
            map.put(n, index);
        }
        map.remove(val);
        nums.remove(size - 1);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    // Time Complexity = O(1)
    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}

