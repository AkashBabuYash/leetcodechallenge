class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int low=prices[0];
        int maxv=0;
        for(int i=1;i<prices.length;i++){
            if(low>prices[i]){
                low=prices[i];
            }
            maxv=Math.max(maxv,prices[i]-low);
            ans=Math.max(maxv,ans);
            

        }


        return ans;
        
    }
}