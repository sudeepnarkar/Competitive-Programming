package Leetcode;

/**
 * @author : Sudeep Narkar
 * @since : 11/12/2020, Thu, 7:55 PM
 **/

//https://leetcode.com/problems/find-the-town-judge/
public class FindTheTownJudge {

    /**
     * In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
     * <p>
     * If the town judge exists, then:
     * <p>
     * The town judge trusts nobody.
     * Everybody (except for the town judge) trusts the town judge.
     * There is exactly one person that satisfies properties 1 and 2.
     * <p>
     * You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
     * <p>
     * If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: N = 2, trust = [[1,2]]
     * Output: 2
     * <p>
     * Example 2:
     * <p>
     * Input: N = 3, trust = [[1,3],[2,3]]
     * Output: 3
     * <p>
     * Example 3:
     * <p>
     * Input: N = 3, trust = [[1,3],[2,3],[3,1]]
     * Output: -1
     * <p>
     * Example 4:
     * <p>
     * Input: N = 3, trust = [[1,2],[2,3]]
     * Output: -1
     * <p>
     * Example 5:
     * <p>
     * Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
     * Output: 3
     */


    public int findJudge(int N, int[][] trust) {

        // corner case when there is only 1 vertex and no trust mapping
        if (trust.length == 0 && N == 1) {
            return N;
        }

        int[] inDegree = new int[N + 1];
        int[] outDegree = new int[N + 1];

        // keep track of the indegree and outdegree of every vertex
        for (int[] arr : trust) {
            inDegree[arr[1]]++;
            outDegree[arr[0]]++;

        }

        int index = 0;
        // The judge is a vertex that has (N-1) indegree and zero outdegree
        while (index < N + 1) {
            if (inDegree[index] == (N - 1) && outDegree[index] == 0) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
