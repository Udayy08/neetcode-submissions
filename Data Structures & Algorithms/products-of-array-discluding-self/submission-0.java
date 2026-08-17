class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int tot=1,sum=1;
        for(int i=0; i<n; i++){
            if(i==0){
                prefix[i] = 1;
            }else{
                tot = tot*nums[i-1];
                prefix[i] = tot;
            }
        }
        for(int i=n-1; i>=0; i--){
            if(i==n-1){
                suffix[n-1]=1;
            }else{
                sum=sum*nums[i+1];
                suffix[i] = sum;
            }
            
        }
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;
    }
}  
