class Solution {
    public static int maxelement(int[] arr,int start,int end){
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
               

            }
            else{
                end=mid;
            }
        }
        return start;
    }
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        return maxelement(arr,0,n-1);
        
    }
}