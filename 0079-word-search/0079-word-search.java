class Solution {
    public static boolean search(char[][] board,int i,int j,int n,int m,boolean[][] vis,String word,int idx){
        if(i<0 || j<0 || i>=n || j>=m || vis[i][j] || board[i][j]!=word.charAt(idx)){
            return false;
        }
        if(idx==word.length()-1){
            return true;
        }
        vis[i][j]=true;

        boolean result=search(board,i+1,j,n,m,vis,word,idx+1) ||
        search(board,i-1,j,n,m,vis,word,idx+1) ||
        search(board,i,j+1,n,m,vis,word,idx+1) ||
        search(board,i,j-1,n,m,vis,word,idx+1);

        vis[i][j]=false;
        return result;


    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] vis=new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char val=word.charAt(0);
                if(board[i][j]==val){
                    if(search(board,i,j,n,m,vis,word,0)){
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
}