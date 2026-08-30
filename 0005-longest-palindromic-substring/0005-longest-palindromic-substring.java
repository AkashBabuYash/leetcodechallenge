class Solution {

    public static boolean count(String st) {
        int s = 0;
        int end = st.length() - 1;

        while (s <= end) {
            if (st.charAt(s) != st.charAt(end)) {
                return false;
            }
            s++;
            end--;
        }

        return true;
    }

    public String longestPalindrome(String s) {

        String ans = "";

        for (int i = 1; i <= s.length(); i++) {

            for (int j = 0; j < i; j++) {

                String st = s.substring(j, i);

                if (count(st) && st.length() > ans.length()) {
                    ans = st;
                }
            }
        }

        return ans;
    }
}