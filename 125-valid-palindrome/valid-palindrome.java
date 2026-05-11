class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.trim();
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z'||c>='0'&&c<='9'){
                  r=r+c;
            }
           
        }
        int l=0;
        int rt=r.length()-1;
        while(l<=rt){
            if(r.charAt(l)!=r.charAt(rt)){
                return false;
            }
            l++;
            rt--;
        }
        return true;
        
    }
}