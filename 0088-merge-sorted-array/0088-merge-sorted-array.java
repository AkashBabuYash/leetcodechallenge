class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int start=m;
        int end=nums1.length-1;
        int i=0;
        while(start<=end && i<nums2.length){
            nums1[start++]=nums2[i++];
        }
        Arrays.sort(nums1);
        
    }
}