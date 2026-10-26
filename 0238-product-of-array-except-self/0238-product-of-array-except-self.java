class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero=0;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else{
            prod*=nums[i];
            }
        }
        if(zero>1){
            Arrays.fill(nums,0);
    
        }
        else if(zero==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i]=prod;
                    

                }
                else{
                    nums[i]=0;
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                nums[i]=prod/nums[i];
            }
        }
        return nums;
        
    }
}