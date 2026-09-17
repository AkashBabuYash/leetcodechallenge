class Solution {
    public int compress(char[] chars) {
        Stack<Character> s = new Stack<>();
        int t = 1;

        s.push(chars[0]);

        for (int i = 1; i < chars.length; i++) {

            if (s.peek().equals(chars[i])) {
                t++;
            } 
            else {
                if (t > 1) {
                    String str = String.valueOf(t);

                    for (int j = 0; j < str.length(); j++) {
                        s.push(str.charAt(j));
                    }
                }

                s.push(chars[i]);
                t = 1;
            }
        }

        if (t > 1) {
            String str = String.valueOf(t);

            for (int j = 0; j < str.length(); j++) {
                s.push(str.charAt(j));
            }
        }

        for (int i = 0; i < s.size(); i++) {
            chars[i] = s.get(i);
        }

        return s.size();
    }
}