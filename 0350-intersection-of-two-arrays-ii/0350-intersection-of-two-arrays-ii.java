class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            ans.add(nums1[i]);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(ans.contains(nums2[i])){
                arr.add(nums2[i]);
                ans.remove(Integer.valueOf(nums2[i]));
            }
        }

         int[] result = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
        
    }
}