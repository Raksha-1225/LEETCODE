class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int v=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;
            }
            if(i>=k){
               if(s.charAt(i-k)=='a'||s.charAt(i-k)=='e'||s.charAt(i-k)=='i'||s.charAt(i-k)=='o'||s.charAt(i-k)=='u'){
                v--;
               }
            }
            max=Math.max(max,v);
        }
        return max;
    }
}
