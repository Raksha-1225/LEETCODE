class Solution {
    public String convertToTitle(int columnNumber) {
        String r="";
        while(columnNumber>0) {
            columnNumber=columnNumber-1; 
            char ch =(char)(columnNumber%26+'A');
            r=ch+r;
            columnNumber/=26;
        }

        return r;
    }
}
