class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int num = i;
            int needed = target - nums[num];
            if(mp.containsKey(needed)){
                return new int[] {mp.get(needed),num};
            }else{
                mp.put(nums[i],i);
            }
        }

        return new int[]{-1,-1};
        
    }
}
