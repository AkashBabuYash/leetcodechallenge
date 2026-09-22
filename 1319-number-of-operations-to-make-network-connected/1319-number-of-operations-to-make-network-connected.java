class Solution {

    public static void connected(ArrayList<ArrayList<Integer>> adj,
                                 boolean[] vis, int curr) {

        vis[curr] = true;

        for (int val : adj.get(curr)) {
            if (!vis[val]) {
                connected(adj, vis, val);
            }
        }
    }

    public int makeConnected(int n, int[][] connections) {

        if (connections.length < n - 1) {
            return -1;
        }

        int ans = 0;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] col : connections) {

            int u = col[0];
            int v = col[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (!vis[i]) {
                ans++;
                connected(adj, vis, i);
            }
        }

        return ans - 1;
    }
}