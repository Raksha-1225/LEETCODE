class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {        
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            h.add(nums1[i]);
        }
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(h.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        int r[]=new int[res.size()];
        int i=0;
        for(int num:res){
            r[i]=num;
            i++;
        }
        return r;
        
    }
}
