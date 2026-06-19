class Solution {
    public String reverseStr(String s, int k) {
        StringBuffer c=new StringBuffer();
        boolean flag=true;
        for(int i=0;i<s.length();i=i+k){
            String str=s.substring(i,Math.min(i+k,s.length()));
            if(flag){
                c.append(new StringBuffer(str).reverse());
                flag=false;
            }
            else{
                c.append(new StringBuffer(str));
                flag=true;
            }

        }
        return c.toString();
    }
}