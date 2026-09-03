class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            map.put(nums[i],map.get(nums[i])+1);


        }
        int ans=0;
        for(int val:map.values()){
            ans=Math.max(ans,val);
        }
        int output=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==ans){
                output=e.getKey();

            }
        }
        return output;

        
    }
}