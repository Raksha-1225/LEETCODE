class Solution {
     public int findGcd(int a,int b){
        if(b==0){
            return a;
        }
        return findGcd(b,a%b);
    }
    public int minOperations(int[] nums,int[] numsDivide){
        Arrays.sort(nums);
        int gcd=numsDivide[0];
        for(int i=1;i<numsDivide.length;i++){
            gcd=findGcd(gcd,numsDivide[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(gcd%nums[i]==0){
                return i;
            }
        }
        return -1;
    }
}