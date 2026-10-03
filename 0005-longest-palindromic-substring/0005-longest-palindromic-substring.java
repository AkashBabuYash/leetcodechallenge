class Solution {

    public String expand(String s, int left, int right) {

        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }

    public String longestPalindrome(String s) {

        String max = "";

        for (int i = 0; i < s.length(); i++) {

            String odd = expand(s, i, i);

            if (odd.length() > max.length()) {
                max = odd;
            }

        
            String even = expand(s, i, i + 1);

            if (even.length() > max.length()) {
                max = even;
            }
        }

        return max;
    }
}