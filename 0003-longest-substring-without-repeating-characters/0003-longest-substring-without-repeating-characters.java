class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> ans=new ArrayList<>();
        
        int max=0;
        for(int i=0;i<s.length();i++){
            if(!ans.contains(s.charAt(i))){
                ans.add(s.charAt(i));
            }
            else{
                while (ans.contains(s.charAt(i))) 
                { 
                    ans.remove(0); 
                }
                ans.add(s.charAt(i));

            }
            max=Math.max(max,ans.size());
        }
        return max;
        
        
    }
}