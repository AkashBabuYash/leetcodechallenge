class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

     
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

  
        ArrayList<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

     
        Collections.sort(list, (a, b) ->
                Integer.compare(b.getValue(), a.getValue()));


        int[] output = new int[k];
        int idx = 0;

        for (Map.Entry<Integer, Integer> e : list) {
            if (idx == k) {
                break;
            }

            output[idx++] = e.getKey();
        }

        return output;
    }
}