class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<List<Integer>>> dp = new ArrayList<>();

        for (int i = 0; i <= target; i++) {
            dp.add(new ArrayList<>());
        }

        dp.get(0).add(new ArrayList<>());

        for (int i = 0; i < candidates.length; i++) {

            int val = candidates[i];

            for (int j = val; j <= target; j++) {

                for (List<Integer> list : dp.get(j - val)) {

                    List<Integer> temp = new ArrayList<>(list);

                    temp.add(val);

                    dp.get(j).add(temp);
                }
            }
        }

        return dp.get(target);
    }
}