class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];
        int res[]=new int[nums.length];
        int total=0;
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
        }
        int sum=0;
        for(int i=1;i<nums.length;i++){
            sum=sum+nums[i-1];
            leftSum[i]=sum;
        }
        for(int i=0;i<nums.length-1;i++){
            total=total-nums[i];
            rightSum[i]=total;
        }
        for(int i=0;i<nums.length;i++){
            res[i]=leftSum[i]-rightSum[i];
            if(res[i]<0){
                res[i]=-res[i];
            }
        }
        return res;
        
    }
}