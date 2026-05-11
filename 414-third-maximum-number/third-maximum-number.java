class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(!al.contains(nums[i]))
            al.add(nums[i]);
        }
        if(al.size()<3){
            return al.get(al.size()-1);
        }
        else{
            return al.get(al.size()-3);
        }

        
        
    }
}