package DataStructures.Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author : Sudeep Narkar
 * @since : 11/5/2020, Thu, 8:48 AM
 **/

// Implementation and searching in an undirected graph
public class Graph {

    HashMap<Integer, Node> map = new HashMap<>();

    public static class Node {
        private int id;
        LinkedList<Node> adjacent = new LinkedList<>();

        private Node(int id) {
            this.id = id;
        }
    }

    public Node getNode(int id) {
        return map.get(id);
    }

    public void addNode(int id) {
        Node node = new Node(id);
        map.put(id, node);
    }

    public void addEdge(int source, int destination) {
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacent.add(d);
        d.adjacent.add(s);
    }

    public boolean depthFirstSearch(int s, int d) {
        Node source = getNode(s);
        Node destination = getNode(d);
        HashSet<Integer> visited = new HashSet<>();
        return depthFirstSearchUtil(source, destination, visited);
    }

    public boolean depthFirstSearchUtil(Node source, Node destination, HashSet<Integer> visited) {

        if (visited.contains(source.id)) {
            return false;
        }

        visited.add(source.id);

        if (source == destination) {
            return true;
        }

        for (int i = 0; i < source.adjacent.size(); i++) {
            Node child = source.adjacent.get(i);
            if (depthFirstSearchUtil(child, destination, visited)) {
                return true;
            }
        }
        return false;
    }

    public boolean breathFirstSearch(int s, int d) {
        Node source = getNode(s);
        Node destination = getNode(d);
        HashSet<Integer> visited = new HashSet<>();
        return breathFirstSearchUtil(source, destination, visited);
    }

    public boolean breathFirstSearchUtil(Node source, Node destination, HashSet<Integer> visited) {

        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(source);

        while (queue.size() != 0) {

            Node node = queue.remove();
            if (node == destination) {
                return true;
            }
            if (visited.contains(node.id)) {
                continue;
            }
            visited.add(node.id);
            for (int j = 0; j < node.adjacent.size(); j++) {
                Node child = node.adjacent.get(j);
                queue.offer(child);
            }
        }
        return false;
    }


    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        System.out.println(graph.breathFirstSearch(3, 4));


    }
}
