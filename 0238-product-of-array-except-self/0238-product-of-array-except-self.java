class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        int prod=1;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
           prod*=nums[i];
        }
        if(count>1){
            for(int i=0;i<nums.length;i++){
                nums[i]=0;
            }
        }
        else if(count==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    Arrays.fill(nums,0);
                    nums[i]=prod;
                    break;
                    
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