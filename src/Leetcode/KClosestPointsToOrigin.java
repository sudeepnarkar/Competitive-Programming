package Leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author : Sudeep Narkar
 * @since : 12/25/2020, Fri, 2:09 PM
 **/

//https://leetcode.com/problems/k-closest-points-to-origin
public class KClosestPointsToOrigin {

    /**
     * We have a list of points on the plane.  Find the K closest points to the origin (0, 0).
     * <p>
     * (Here, the distance between two points on a plane is the Euclidean distance.)
     * <p>
     * You may return the answer in any order.  The answer is guaranteed to be unique (except for the order that it is in.)
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: points = [[1,3],[-2,2]], K = 1
     * Output: [[-2,2]]
     * Explanation:
     * The distance between (1, 3) and the origin is sqrt(10).
     * The distance between (-2, 2) and the origin is sqrt(8).
     * Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
     * We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].
     * Example 2:
     * <p>
     * Input: points = [[3,3],[5,-1],[-2,4]], K = 2
     * Output: [[3,3],[-2,4]]
     * (The answer [[-2,4],[3,3]] would also be accepted.)
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= K <= points.length <= 10000
     * -10000 < points[i][0] < 10000
     * -10000 < points[i][1] < 10000
     *
     * @param points
     * @param K
     * @return
     */

    // Time Complexity = O(N) where N is the length of the points array
    // Time Complexity = O(NLogK) where N is the length of the points array and K is the size of maxHeap
    public int[][] kClosest(int[][] points, int K) {

        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((p0, p1) -> p1[0] * p1[0] + p1[1] * p1[1] - (p0[0] * p0[0] + p0[1] * p0[1]));

        for (int[] arr : points) {
            maxHeap.add(arr);
            // maintain top K max elements
            if (maxHeap.size() > K) {
                maxHeap.remove();
            }
        }

        // write it to result array to return
        int[][] res = new int[K][2];
        for (int i = 0; i < K; i++) {
            res[i] = maxHeap.poll();
        }
        return res;
    }

}

