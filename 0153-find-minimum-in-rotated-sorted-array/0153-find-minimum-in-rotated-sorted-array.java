class Solution {
    public static int minel(int[] nums,int start,int end){
  
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return nums[start];
    }
    public int findMin(int[] nums) {
        int n=nums.length;
        return minel(nums,0,n-1);
        
    }
}