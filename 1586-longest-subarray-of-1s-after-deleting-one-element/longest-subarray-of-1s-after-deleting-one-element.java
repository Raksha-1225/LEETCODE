class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int ct=0;
        int max=0;
        int zc=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==1){
                ct++;
            }
            else{
                if(nums[r]==0){
                    zc++;
                }
                if(zc==1){
                    ct++;
                }
                else{
                    while(zc!=1){
                        if(nums[l]==0){
                            zc--;
                        }
                        l++;
                        ct--;
                    }
                    ct++;
                }
                
            }
            max=Math.max(max,ct);
        }
        return max-1;

        
    }
}