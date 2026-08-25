class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> set = new HashSet<>(wordList);

        if (!set.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int k = 0; k < size; k++) {

                String word = queue.poll();

                if (word.equals(endWord)) {
                    return level;
                }

                char[] arr = word.toCharArray();

                for (int j = 0; j < arr.length; j++) {

                    char original = arr[j];

                    for (char ch = 'a'; ch <= 'z'; ch++) {

                        arr[j] = ch;

                        String curr = new String(arr);

                        if (set.contains(curr)) {
                            queue.add(curr);
                            set.remove(curr);
                        }
                    }

                    arr[j] = original;
                }
            }

            level++;
        }

        return 0;
    }
}