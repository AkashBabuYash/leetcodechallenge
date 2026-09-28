class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i=0;i<=amount;i++){

            for(int val:coins){
                if(i<val){
                    continue;
                }
                else{
                    if(dp[i-val]!=-1){
                        if(dp[i]==-1){
                            dp[i]=dp[i-val]+1;
                        }
                        else{
                            dp[i]=Math.min(dp[i],dp[i-val]+1);
                        }
                   }
                }
            }

        }
        return dp[amount];
        
        
    }
}