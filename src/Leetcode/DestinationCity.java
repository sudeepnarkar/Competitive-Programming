import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Sudeep Narkar
 * @since : 12/13/20, Sun, 11:26 AM
 **/

//https://leetcode.com/problems/destination-city
public class DestinationCity {

    /**
     * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
     * <p>
     * It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
     * Output: "Sao Paulo"
     * Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
     * Example 2:
     * <p>
     * Input: paths = [["B","C"],["D","B"],["C","A"]]
     * Output: "A"
     * Explanation: All possible trips are:
     * "D" -> "B" -> "C" -> "A".
     * "B" -> "C" -> "A".
     * "C" -> "A".
     * "A".
     * Clearly the destination city is "A".
     * Example 3:
     * <p>
     * Input: paths = [["A","Z"]]
     * Output: "Z"
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= paths.length <= 100
     * paths[i].length == 2
     * 1 <= cityAi.length, cityBi.length <= 10
     * cityAi != cityBi
     * All strings consist of lowercase and uppercase English letters and the space character.
     *
     * @param paths
     * @return The city without any path outgoing to another city.
     */

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public String destCity(List<List<String>> paths) {

        Map<String, String> map = new HashMap<>();
        for (List<String> list : paths) {
            map.put(list.get(0), list.get(1));
        }
        // starting point
        String place = paths.get(0).get(0);
        while (place != null) {
            if (map.containsKey(place)) {
                place = map.get(place);
            } else {
                break;
            }
        }
        return place;
    }
}
