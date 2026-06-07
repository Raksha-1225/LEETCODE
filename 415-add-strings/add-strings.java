class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        StringBuilder result=new StringBuilder();
        while(i>=0||j>=0||carry>0){
            int d1;
            if(i>=0){
                d1=num1.charAt(i)-'0';
            }
            else{
                d1=0;
            }
            int d2;
            if(j>=0){
                d2=num2.charAt(j)-'0';
            }
            else{
                d2=0;
            }
            int sum=d1+d2+carry;
            carry=sum/10;
            result.append(sum%10);
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}

        