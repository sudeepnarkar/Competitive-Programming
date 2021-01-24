package Leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author : Sudeep Narkar
 * @since : 1/23/2021, Sat, 7:22 PM
 **/

//https://leetcode.com/problems/first-unique-number
public class FirstUnique {

    /**
     * You have a queue of integers, you need to retrieve the first unique integer in the queue.
     * <p>
     * Implement the FirstUnique class:
     * <p>
     * FirstUnique(int[] nums) Initializes the object with the numbers in the queue.
     * int showFirstUnique() returns the value of the first unique integer of the queue, and returns -1 if there is no such integer.
     * void add(int value) insert value to the queue.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input:
     * ["FirstUnique","showFirstUnique","add","showFirstUnique","add","showFirstUnique","add","showFirstUnique"]
     * [[[2,3,5]],[],[5],[],[2],[],[3],[]]
     * Output:
     * [null,2,null,2,null,3,null,-1]
     * Explanation:
     * FirstUnique firstUnique = new FirstUnique([2,3,5]);
     * firstUnique.showFirstUnique(); // return 2
     * firstUnique.add(5);            // the queue is now [2,3,5,5]
     * firstUnique.showFirstUnique(); // return 2
     * firstUnique.add(2);            // the queue is now [2,3,5,5,2]
     * firstUnique.showFirstUnique(); // return 3
     * firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
     * firstUnique.showFirstUnique(); // return -1
     * <p>
     * Example 2:
     * <p>
     * Input:
     * ["FirstUnique","showFirstUnique","add","add","add","add","add","showFirstUnique"]
     * [[[7,7,7,7,7,7]],[],[7],[3],[3],[7],[17],[]]
     * Output:
     * [null,-1,null,null,null,null,null,17]
     * Explanation:
     * FirstUnique firstUnique = new FirstUnique([7,7,7,7,7,7]);
     * firstUnique.showFirstUnique(); // return -1
     * firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7]
     * firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3]
     * firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3,3]
     * firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7,3,3,7]
     * firstUnique.add(17);           // the queue is now [7,7,7,7,7,7,7,3,3,7,17]
     * firstUnique.showFirstUnique(); // return 17
     * <p>
     * Example 3:
     * <p>
     * Input:
     * ["FirstUnique","showFirstUnique","add","showFirstUnique"]
     * [[[809]],[],[809],[]]
     * Output:
     * [null,809,null,-1]
     * Explanation:
     * FirstUnique firstUnique = new FirstUnique([809]);
     * firstUnique.showFirstUnique(); // return 809
     * firstUnique.add(809);          // the queue is now [809,809]
     * firstUnique.showFirstUnique(); // return -1
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 10^5
     * 1 <= nums[i] <= 10^8
     * 1 <= value <= 10^8
     * At most 50000 calls will be made to showFirstUnique and add.
     */


    Set<Integer> set;
    Map<Integer, Boolean> map;

    //Time Complexity = O(N), where N is the length of nums
    public FirstUnique(int[] nums) {
        set = new LinkedHashSet<>();
        map = new HashMap<>();
        for (int n : nums) {
            add(n);
        }
    }

    //Time Complexity = O(1)
    public int showFirstUnique() {
        Iterator it = set.iterator();
        if (set.size() != 0) {
            return (int) it.next();
        }
        return -1;
    }

    //Time Complexity = O(1)
    public void add(int value) {
        /**
         * Check if the value has been encountered before,
         * If not , add it to map and set
         */
        if (!map.containsKey(value)) {
            map.put(value, true);
            set.add(value);

        }

        /**
         * If the value, has been encountered, remove it from the set
         */
        else {
            set.remove(value);
        }
    }
}
