class Solution {
    public static int bsearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[start]<=nums[mid]){
                if(nums[mid]>target && nums[start]<=target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;

    }
    public int search(int[] nums, int target) {
        return bsearch(nums,target,0,nums.length-1);
        
    }
}