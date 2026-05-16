class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String init=countAndSay(n-1);
        StringBuilder res=new StringBuilder();
        for(int i=0;i<init.length();i++){
            char ch=init.charAt(i);
            int count=1;
            while(i<init.length()-1&&init.charAt(i)==init.charAt(i+1)){
                count++;
                i++;
            }
            res.append(count).append(ch);
        }
        return res.toString();
        
    }
}