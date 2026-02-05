class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int rs[]=new int[nums.length];
        int l=0;
        int r=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                rs[l]=nums[i];
                l++;
            }
            else{
                rs[r]=nums[i];
                r--;
            }
        }
        return rs;

        
    }
}