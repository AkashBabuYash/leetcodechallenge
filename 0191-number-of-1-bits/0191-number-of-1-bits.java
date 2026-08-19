class Solution {
    public int hammingWeight(int n) {
        int len=Integer.toBinaryString(n).length();
        int sum=0;
        for(int i=0;i<len;i++){
            int p=1<<i;
            int s=p & n;
            if(s>0){
                sum++;
            }
        }
        return sum;
        
    }
}