class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        if(num>0){
        String res="";
        while(num!=0){
            res=num%7+res;
            num=num/7;
        }
         return res;
        }
        else{
            num=-num;
            String res="";
          while(num!=0){
            res=num%7+res;
            num=num/7;
        }
        return "-"+res;

        }
        
        
         
        
    }
}