class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
                if(mp.get(nums[i])>1) return true;
            }else{
                mp.put(nums[i],1);
            }
        
        }
        return false;
    }
}