
class Solution {

    public static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {

        int n = nums.length - 1;
        int temp = -1;

        while (n > 0) {
            if (nums[n] > nums[n - 1]) {
                temp = n - 1;
                break;
            }
            n--;
        }

        if (temp != -1) {

            int j = nums.length - 1;

            while (nums[j] <= nums[temp]) {
                j--;
            }

            int value = nums[temp];
            nums[temp] = nums[j];
            nums[j] = value;
        }

        reverse(nums, temp + 1, nums.length - 1);
    }
}

