class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int nums[]=new int[n+m];
        for(int i=0;i<n;i++){
            nums[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            nums[i+n]=nums2[i];
        }
        Arrays.sort(nums);
        double med;
        if((n+m)%2!=0){
            med=nums[(n+m)/2];
        }
        else{
            med=(nums[(n+m)/2]+nums[((n+m)/2)-1])/2.0;
        }
        return med;
        
    }
}