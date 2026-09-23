class Solution {
    public int myAtoi(String s) {

        int idx = 0;

        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }

        if (idx == s.length()) {
            return 0;
        }

        int sign = 1;

        if (s.charAt(idx) == '-') {
            sign = -1;
            idx++;
        } 
        else if (s.charAt(idx) == '+') {
            idx++;
        }

        int ans = 0;

        while (idx < s.length() &&
               s.charAt(idx) >= '0' &&
               s.charAt(idx) <= '9') {

            int digit = s.charAt(idx) - '0';

            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            ans = ans * 10 + digit;
            idx++;
        }

        return ans * sign;
    }
}