class Solution {
    public int numberOfSubstrings(String s) {
        int l=0;
        int count=0;
        int f[]=new int[3];
        for(int r=0;r<s.length();r++){
            f[s.charAt(r)-'a']++;
            while(f[0]>0&&f[1]>0&&f[2]>0){
                count=count+s.length()-r;
                f[s.charAt(l)-'a']--;
                l++;
            }
        }
        return count;
    }
}