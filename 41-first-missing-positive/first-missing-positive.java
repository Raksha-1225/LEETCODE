class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                h.add(nums[i]);
            }
        }
        int misnum=1;
        while(h.contains(misnum)){
            misnum++;
        }
        return misnum;
    }
}