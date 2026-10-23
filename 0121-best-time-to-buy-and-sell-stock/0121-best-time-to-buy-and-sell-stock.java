class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int buy=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            max=Math.max(max,prices[i]-buy);

        }
        return max;
        
    }
}