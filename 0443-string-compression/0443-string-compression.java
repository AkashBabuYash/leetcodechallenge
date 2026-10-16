
import java.util.*;

class Solution {
    public int compress(char[] chars) {
        StringBuilder ans = new StringBuilder();
        int val = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                val++;
            } else {
                if (val != 1) {
                    ans.append(chars[i - 1]);
                    ans.append(Integer.toString(val));
                    val = 1;
                } else {
                    ans.append(chars[i - 1]);
                    val = 1;
                }
            }
        }

       
        ans.append(chars[chars.length - 1]);

        if (val > 1) {
            ans.append(Integer.toString(val));
        }

  
        for (int i = 0; i < ans.length(); i++) {
            chars[i] = ans.charAt(i);
        }

        return ans.length();
    }
}
