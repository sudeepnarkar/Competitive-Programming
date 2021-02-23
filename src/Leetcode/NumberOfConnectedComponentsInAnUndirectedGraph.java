package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : Sudeep Narkar
 * @since : 2/19/21, Fri, 8:35 PM
 **/

//https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph
public class NumberOfConnectedComponentsInAnUndirectedGraph {

    /**
     * Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes), write a function to find the number of connected components in an undirected graph.
     * <p>
     * Example 1:
     * <p>
     * Input: n = 5 and edges = [[0, 1], [1, 2], [3, 4]]
     * <p>
     * 0          3
     * |          |
     * 1 --- 2    4
     * <p>
     * Output: 2
     * Example 2:
     * <p>
     * Input: n = 5 and edges = [[0, 1], [1, 2], [2, 3], [3, 4]]
     * <p>
     * 0           4
     * |           |
     * 1 --- 2 --- 3
     * <p>
     * Output:  1
     * Note:
     * You can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.
     *
     * @param n
     * @param edges
     * @return number of connected components in an undirected graph.
     */

    //BFS approach
    //Time Complexity =  length of the edges array
    //Space Complexity = length of edges array * 2
    public int countComponentsBFS(int n, int[][] edges) {

        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int v = edge[0];
            int child = edge[1];
            adjList.get(v).add(child);
            adjList.get(child).add(v);
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int vertex = i;
            if (!visited[vertex]) {
                q.add(vertex);
                count++;
                while (!q.isEmpty()) {
                    vertex = q.poll();
                    visited[vertex] = true;
                    List<Integer> list = adjList.get(vertex);
                    if (list == null) {
                        continue;
                    }
                    for (int j = 0; j < list.size(); j++) {
                        int child = list.get(j);
                        if (!visited[child]) {
                            q.add(child);
                        }
                    }
                }
            }
        }
        return count;
    }

    //DFS approach
    //Time Complexity =  length of the edges array
    //Space Complexity = length of edges array * 2
    public int countComponentsDFS(int n, int[][] edges) {

        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int v = edge[0];
            int child = edge[1];
            adjList.get(v).add(child);
            adjList.get(child).add(v);
        }

        boolean[] visited = new boolean[n];

        int count = 0;
        for (int vertex = 0; vertex < n; vertex++) {
            if (!visited[vertex]) {
                count++;
                visited[vertex] = true;
                countComponentsDFS(visited, vertex, adjList);
            }
        }
        return count;
    }

    public void countComponentsDFS(boolean[] visited, int vertex, List<List<Integer>> adjList) {

        for (int next : adjList.get(vertex)) {
            if (!visited[next]) {
                visited[next] = true;
                countComponentsDFS(visited, next, adjList);
            }
        }
    }
}
