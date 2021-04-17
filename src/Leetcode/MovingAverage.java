package Leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author : Sudeep Narkar
 * @since : 3/27/21, Sat, 5:55 PM
 **/

//https://leetcode.com/problems/moving-average-from-data-stream
class MovingAverage {

    Deque<Integer> queue;
    double sum;
    double avg;
    int size;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        this.queue = new LinkedList<>();
        this.sum = 0.0;
        this.avg = 0.0;
        this.size = size;
    }

    /**
     * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
     * <p>
     * Implement the MovingAverage class:
     * <p>
     * MovingAverage(int size) Initializes the object with the size of the window size.
     * double next(int val) Returns the moving average of the last size values of the stream.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input
     * ["MovingAverage", "next", "next", "next", "next"]
     * [[3], [1], [10], [3], [5]]
     * Output
     * [null, 1.0, 5.5, 4.66667, 6.0]
     * <p>
     * Explanation
     * MovingAverage movingAverage = new MovingAverage(3);
     * movingAverage.next(1); // return 1.0 = 1 / 1
     * movingAverage.next(10); // return 5.5 = (1 + 10) / 2
     * movingAverage.next(3); // return 4.66667 = (1 + 10 + 3) / 3
     * movingAverage.next(5); // return 6.0 = (10 + 3 + 5) / 3
     *
     * @param val
     * @return the moving average of the data stream of the given size
     */

    //Time Complexity = O(N), where N is the length of the data stream
    //Space Complexity = O(1), Deque size remains constant
    public double next(int val) {

        //check queue window to add or remove values
        //add to the front and remove from the rear
        if (queue.size() < size) {
            queue.addFirst(val);
            sum += val;
        } else {
            int last = queue.removeLast();
            sum -= last;
            queue.addFirst(val);
            sum += val;
        }
        return sum / queue.size();
    }
}
