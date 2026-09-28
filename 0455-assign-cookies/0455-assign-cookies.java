import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans = 0;
        int i = 0;
        int es = g.length - 1;
        int ss = 0;
        int n = s.length - 1;

        Arrays.sort(g);
        Arrays.sort(s);

        while (i <= es && ss <= n) {
            if (g[i] <= s[ss]) {
                ans++;
                i++;
                ss++;
            } else {
                ss++;
            }
        }

        return ans;
    }
}