class Solution {
    public int longestOnes(int[] nums, int k) {
        int s=0;
        int r=0;
        int max=0;
        for(int e=0;e<nums.length;e++){
            if(nums[e]==0){
                r++;
            }
            while(r>k){
                if(nums[s]==0){
                    r--;
                }
                s++;
            }
            max=Math.max(max,e-s+1);
        }
        return max;
        
    }
}