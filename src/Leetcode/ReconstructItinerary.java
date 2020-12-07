package Leetcode;

import java.util.*;

/**
 * @author : Sudeep Narkar
 * @since : 12/7/20, Mon, 12:39 AM
 **/
public class ReconstructItinerary {

    /**
     * Given a list of airline tickets represented by pairs of departure and arrival airports [from, to], reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK. Thus, the itinerary must begin with JFK.
     * <p>
     * Note:
     * <p>
     * If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string. For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
     * All airports are represented by three capital letters (IATA code).
     * You may assume all tickets form at least one valid itinerary.
     * One must use all the tickets once and only once.
     * Example 1:
     * <p>
     * Input: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
     * Output: ["JFK", "MUC", "LHR", "SFO", "SJC"]
     * Example 2:
     * <p>
     * Input: [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
     * Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
     * Explanation: Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"].
     * But it is larger in lexical order.
     *
     * @param tickets
     * @return itenarary list
     */

    // Time Complexity = O(ELogE) E is the number of edges. Each edge is put in the queue once and pulled out once.
    // Space Complexity = O (E)
    public List<String> findItinerary(List<List<String>> tickets) {

        HashMap<String, PriorityQueue<String>> targetsMap = new HashMap<>();
        for (List<String> ticket : tickets) {
            targetsMap.computeIfAbsent(ticket.get(0), k -> new PriorityQueue()).add(ticket.get(1));
        }
        List<String> itenararyList = new ArrayList<>();
        Stack<String> st = new Stack<>();
        st.push("JFK");
        while (!st.isEmpty()) {
            while (targetsMap.containsKey(st.peek()) && !targetsMap.get(st.peek()).isEmpty()) {
                st.push(targetsMap.get(st.peek()).poll());
            }
            itenararyList.add(0, st.pop());
        }
        return itenararyList;
    }
}
