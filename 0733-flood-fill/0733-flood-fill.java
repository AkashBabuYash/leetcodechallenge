class Solution {
    public static void df(int[][] image,int i,int j,int n,int m,int color,boolean[][] vis,int key){
        if(i<0 || j<0 || i>=n || j>=m || vis[i][j] || image[i][j]!=key){
            return;
        }

        image[i][j]=color;
        vis[i][j]=true;

        df(image,i+1,j,n,m,color,vis,key);
        df(image,i-1,j,n,m,color,vis,key);
        df(image,i,j+1,n,m,color,vis,key);
        df(image,i,j-1,n,m,color,vis,key);
        

    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int n = image.length;
        int m = image[0].length;

        boolean[][] vis = new boolean[n][m];


        int original = image[sr][sc];

        if (original == color)
            return image;

        df(image,sr,sc,n,m,color,vis,original);

      

        return image;
    }
}