import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        HashSet<Integer> s = new HashSet<>();

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            s.add(nums[i]);
        }

        if (s.size() < 3) {
            return max;
        }

        for (int val : s) {
            if (ans.size() < 3) {
                ans.add(val);
            } else if (val > ans.peek()) {
                ans.poll();
                ans.add(val);
            }
        }

        return ans.peek();
    }
}