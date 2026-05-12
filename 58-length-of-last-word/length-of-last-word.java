class Solution {
    public int lengthOfLastWord(String s) {
        String r[]=s.split(" ");
        String last=r[r.length-1];
        int len=last.length();
        return len; 
        
    }
}