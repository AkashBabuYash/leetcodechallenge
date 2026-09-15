class Solution {
    public static void getpermute(int[] nums, ArrayList<ArrayList<Integer>> ans, int start) {

        if(start == nums.length){
            ArrayList<Integer> output = new ArrayList<>();

            for(int x : nums){
                output.add(x);
            }

            ans.add(output);
            return;
        }

        for(int i = start; i < nums.length; i++){

            int temp = nums[start];
            nums[start] = nums[i];
            nums[i] = temp;

            getpermute(nums, ans, start + 1);

            temp = nums[start];
            nums[start] = nums[i];
            nums[i] = temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        getpermute(nums, ans, 0);

        return (List) ans;
    }
}