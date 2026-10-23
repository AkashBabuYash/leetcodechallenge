class Solution {
    public void moveZeroes(int[] nums) {
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }

        }
        while(zero>0){
            nums[j++]=0;
            zero--;
        }
        
    }
}