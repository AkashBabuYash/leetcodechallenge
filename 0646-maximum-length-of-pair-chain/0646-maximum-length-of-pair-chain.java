class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int n=pairs.length;
        int v=pairs[0][1];
        int ans=1;
        for(int i=1;i<n;i++){
            if(v<pairs[i][0]){
                ans++;
                v=pairs[i][1];


            }
        }
        return ans;
        
    }
}