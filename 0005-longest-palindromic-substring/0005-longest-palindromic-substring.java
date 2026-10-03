class Solution {

    public static String dfs(String s, int start, int end) {

        int left = start;
        int right = end;

        while (left <= right) {

            if (s.charAt(left) != s.charAt(right)) {
                return "";
            }

            left++;
            right--;
        }

        return s.substring(start, end + 1);
    }

    public String longestPalindrome(String s) {

        String max = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = s.length() - 1; j >= i; j--) {

                if (s.charAt(i) == s.charAt(j)) {

                    String temp = dfs(s, i, j);

                    if (temp.length() > max.length()) {
                        max = temp;
                    }
                }
            }
        }

        return max;
    }
}