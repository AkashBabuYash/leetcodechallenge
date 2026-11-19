class Solution {
    public static void dfs(int[][] image,boolean[][] vis,int sr,int sc,int color,int n,int m,int val){
        if(sr<0 || sc<0 || sr>=n || sc>=m || vis[sr][sc] || image[sr][sc]!=val){
            return;
        }
        vis[sr][sc]=true;
        image[sr][sc]=color;
        dfs(image,vis,sr+1,sc,color,n,m,val);
        dfs(image,vis,sr-1,sc,color,n,m,val);
        dfs(image,vis,sr,sc+1,color,n,m,val);
        dfs(image,vis,sr,sc-1,color,n,m,val);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        boolean[][] vis=new boolean[n][m];
        int val=image[sr][sc];
        dfs(image,vis,sr,sc,color,n,m,val);
        return image;
        
    }
}