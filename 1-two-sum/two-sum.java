class Solution {
    public int[] twoSum(int[] nums, int target) {
        int t[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    t[0]=i;
                    t[1]=j;
                    break;
                }
            }
        }
         return t;
    }
}