class Solution {
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj,int src,int dst,boolean[] vis){

        vis[src]=true;
            if(src==dst){
                return true;
            }
        for(int val:adj.get(src)){
        
            if(!vis[val]){
                if(dfs(adj,val,dst,vis)){
                    return true;
                }
            }
    
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());

        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis=new boolean[n];


       
        return dfs(adj,source,destination,vis);
               
             
      

        
    }
}