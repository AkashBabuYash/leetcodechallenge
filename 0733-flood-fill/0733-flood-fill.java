class Solution {
    public static void floodcal(int[][] image,int i,int j,int n,int m,boolean[][] vis,int color,int tar){
        if(i<0 || j<0 || i>=n || j>=m || vis[i][j] || image[i][j]!=tar){
            return ;
        }
        vis[i][j]=true;
        image[i][j]=color;

        floodcal(image,i+1,j,n,m,vis,color,tar);
        floodcal(image,i-1,j,n,m,vis,color,tar);
        floodcal(image,i,j+1,n,m,vis,color,tar);
        floodcal(image,i,j-1,n,m,vis,color,tar);




    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        boolean[][] vis=new boolean[image.length][image[0].length];
        

       int tar=image[sr][sc];
        floodcal(image,sr,sc,image.length,image[0].length,vis,color,tar);
        return image;
    }
}