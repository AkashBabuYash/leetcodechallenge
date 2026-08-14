class Solution {
    public int firstUniqChar(String s) {
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
        arr.add(s.charAt(i));
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr.remove((Character) ch);
            if(!arr.contains(ch)){
                return i;
            }
            arr.add(ch);
        }
        return -1;
        
    }
}