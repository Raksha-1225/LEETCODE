class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int lsum=0;
            int rsum=0;
            for(int j=0;j<i;j++){
                lsum=lsum+nums[j];
            }
            for(int j=i+1;j<n;j++){
                rsum=rsum+nums[j];
            }
            if(lsum==rsum){
                return i;
            }
        }
        return -1;
        
    }
}