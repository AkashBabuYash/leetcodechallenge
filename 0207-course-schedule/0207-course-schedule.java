
import java.util.*;

class Solution {
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj, int curr,
                              boolean[] vis, boolean[] pathVis) {
        vis[curr] = true;
        pathVis[curr] = true;

        for (int val : adj.get(curr)) {

            if (pathVis[val]) {
                return false;
            }

            if (!vis[val]) {
                if (!dfs(adj, val, vis, pathVis)) {
                    return false;
                }
            }
        }

        pathVis[curr] = false;
        return true;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            int u = pre[0];
            int v = pre[1];
            adj.get(v).add(u);
        }

        boolean[] vis = new boolean[numCourses];
        boolean[] pathVis = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                if (!dfs(adj, i, vis, pathVis)) {
                    return false;
                }
            }
        }

        return true;
    }
}
