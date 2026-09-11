class Solution {

    static class Node {
        Node[] childrens;
        boolean eow;

        Node() {
            childrens = new Node[26];
            eow = false;
        }
    }

    static Node root = new Node();

    public static void build(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.childrens[idx] == null) {
                curr.childrens[idx] = new Node();
            }

            curr = curr.childrens[idx];
        }

        curr.eow = true;
    }

    public static String search(String word) {

        if (root.eow) {
            return "";
        }

        StringBuilder st = new StringBuilder();
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {

            int count = 0;
            int index = -1;

            for (int j = 0; j < 26; j++) {
                if (curr.childrens[j] != null) {
                    count++;
                    index = j;
                }
            }

            if (count != 1) {
                break;
            }

            st.append((char)(index + 'a'));

            curr = curr.childrens[index];

            if (curr.eow) {
                break;
            }
        }

        return st.toString();
    }

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        root = new Node();

        for (int i = 0; i < strs.length; i++) {
            build(strs[i]);
        }

        return search(strs[0]);
    }
}