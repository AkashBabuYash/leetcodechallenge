class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<Set<List<Integer>>> dp = new ArrayList<>();

        for (int i = 0; i <= target; i++) {
            dp.add(new HashSet<>());
        }

        dp.get(0).add(new ArrayList<>());

        for (int i = 0; i < candidates.length; i++) {

            int val = candidates[i];

            for (int j = target; j >= val; j--) {

                for (List<Integer> list : dp.get(j - val)) {

                    List<Integer> temp = new ArrayList<>(list);

                    temp.add(val);

                    dp.get(j).add(temp);
                }
            }
        }

        return new ArrayList<>(dp.get(target));
    }
}