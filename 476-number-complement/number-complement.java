class Solution {
    public int findComplement(int num) {
        String b=Integer.toBinaryString(num);
        int res[]=new int[b.length()];
        for(int i=0;i<b.length();i++){
            res[i]=b.charAt(i)-'0';
        }
        for(int i=0;i<res.length;i++){
            if(res[i]==1){
                res[i]=0;
            }
            else{
                res[i]=1;
            }
        }
        String s="";
        for(int i=0;i<res.length;i++){
            s=s+res[i];
        }
        System.out.print(s);
        return Integer.parseInt(s,2);
        
    }
}