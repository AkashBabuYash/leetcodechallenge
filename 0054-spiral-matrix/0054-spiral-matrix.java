class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int row=0;
        int erow=matrix.length;
        int col=0;
        int ecol=matrix[0].length;
        while(row<erow && col<ecol){

        for(int i=col;i<ecol;i++){
            ans.add(matrix[row][i]);
        }
        row++;
        for(int j=row;j<erow;j++){
            ans.add(matrix[j][ecol-1]);
        }
        ecol--;
        if(row<erow){
        for(int k=ecol-1;k>=col;k--){
            ans.add(matrix[erow-1][k]);
        }
        }
        erow--;

        if(col<ecol){

        for(int k=erow-1;k>=row;k--){
            ans.add(matrix[k][col]);
        }
        }
        col++;
        }

        return ans;
        
    }
}