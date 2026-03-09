class Solution {
    public int maxProduct(int[] nums) {
        int minProd=nums[0];
        int maxProd=nums[0];
        int ans=nums[0];
        int c1,c2;
        for(int i=1;i<nums.length;i++){
            c1=minProd*nums[i];
            c2=maxProd*nums[i];
            minProd=Math.min(nums[i],Math.min(c1,c2));
            maxProd=Math.max(nums[i],Math.max(c1,c2));
            ans=Math.max(ans,maxProd);
        }   
        return ans;     
    }
}