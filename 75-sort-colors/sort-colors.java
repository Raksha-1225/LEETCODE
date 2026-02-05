class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
        }
        System.out.print(al);
        
    }
}