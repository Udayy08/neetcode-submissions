class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> mp = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            }else{
                mp.put(nums[i],1);
            }
            
        }
        // int sz = mp.size();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if(!pq.contains(entry.getValue())){
                pq.add(entry.getValue());
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        while(!pq.isEmpty()){
            for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
                int freq = pq.peek();
                if(freq == entry.getValue()){
                    res.add(entry.getKey());
                }
            }
            pq.poll();
        }
        for(int  i=0; i<k; i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
