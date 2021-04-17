package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author : Sudeep Narkar
 * @since : 4/15/21, Thu, 7:15 AM
 **/

//https://leetcode.com/problems/time-based-key-value-store/
public class TimeBasedKeyValueStore {

    /**
     * Initialize your data structure here.
     */

    /**
     * Overall time and space complexity is O(N)
     */
    Map<String, TreeMap<Integer, String>> map;

    public TimeBasedKeyValueStore() {
        map = new HashMap<>();
    }

    //Time Complexity = O(1)
    //Space Complexity = O(N), where N is the number of times it is called
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new TreeMap<>());
        }
        map.get(key).put(timestamp, value);
    }

    //Time Complexity = O(Log N), where N is the number of entries
    //Space Complexity = O(N), where N is the number of entries
    public String get(String key, int timestamp) {
        //Need to use floor key
        TreeMap<Integer, String> treeMap = map.get(key);
        if (treeMap == null) {
            return "";
        }
        //Get the floor key i.e - the key that is has the highest value smaller than equal to timestamp
        Integer floorKey = treeMap.floorKey(timestamp);
        return floorKey == null ? "" : treeMap.get(floorKey);
    }
}
