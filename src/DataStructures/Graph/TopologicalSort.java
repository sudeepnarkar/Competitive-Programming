package DataStructures.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * @author : Sudeep Narkar
 * @since : 11/15/2020, Sun, 8:02 AM
 **/


/**
 * Topological sort is an ordering of vertices in a Directed Acyclic Graph
 * such that for every edge A -> B, vertex A should always appear before B in the
 * ordering
 */
public class TopologicalSort {

    Map<Integer, Node> map = new HashMap<>();

    static class Node {
        int id;
        List<Node> adjacent = new ArrayList<>();

        public Node(int id) {
            this.id = id;
        }
    }

    public void addNode(int id) {
        Node node = new Node(id);
        map.put(id, node);
    }

    public Node getNode(int id) {
        return map.get(id);

    }

    public void addEdge(int source, int destination) {
        Node s = map.get(source);
        Node d = map.get(destination);
        s.adjacent.add(d);
    }


    public Stack<Node> topSort() {

        Set<Node> visited = new HashSet<>();
        Stack<Node> topSortOrder = new Stack<>();

        // explore all vertices in graph
        for (Node node : map.values()) {
            if (visited.contains(node)) {
                continue;
            }
            topSortUtil(node, visited, topSortOrder);
        }

        return topSortOrder;
    }


    public void topSortUtil(Node node, Set<Node> visited, Stack<Node> toptopSortOrder) {

        // Add node to visited set
        visited.add(node);
        /*Explore all vertices by DFS and add to stack when
        there are no more to explore*/
        for (Node child : node.adjacent) {
            if (visited.contains(child)) {
                continue;
            }
            topSortUtil(child, visited, toptopSortOrder);
        }
        toptopSortOrder.push(node);
    }


    public static void main(String[] args) {

        TopologicalSort topologicalSort = new TopologicalSort();

        // add nodes
        topologicalSort.addNode(1);
        topologicalSort.addNode(2);
        topologicalSort.addNode(3);
        topologicalSort.addNode(4);

        //add directed edges between nodes
        topologicalSort.addEdge(1, 2);
        topologicalSort.addEdge(3, 2);
        topologicalSort.addEdge(3, 4);

        Stack<Node> topologicalSortOrder = topologicalSort.topSort();

        // printing the topological sort order
        while (!topologicalSortOrder.isEmpty()) {
            System.out.println(topologicalSortOrder.pop().id);
        }
    }

}
