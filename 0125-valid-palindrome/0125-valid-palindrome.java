class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        char[] arr=str.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        String sp=new String(arr);
        return sp.equals(str);
       
    

        
    }
}