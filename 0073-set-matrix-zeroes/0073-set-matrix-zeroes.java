class Solution {
    public void setZeroes(int[][] matrix) {
       
        int count=0;
    
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    count++;
                  
                }
            }
        }
        int idx=0;
         int[] row=new int[count];
        int[] col=new int[count];
               for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[idx]=i;
                    col[idx]=j;
                    idx++;
                  
                }
            }
        }
        for(int i=0;i<count;i++){
            int id=row[i];
            int ic=col[i];

            for(int j=0;j<matrix[0].length;j++){
                matrix[id][j]=0;
            }

             for(int k=0;k<matrix.length;k++){
                matrix[k][ic]=0;
            }
        }
        
    }
}