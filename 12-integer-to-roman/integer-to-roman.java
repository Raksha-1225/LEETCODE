class Solution {
    public String intToRoman(int num) {
        String[] thou={"","M","MM","MMM"};
        String[] hund={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] ones={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String res="";
        res=res+thou[num/1000];
        res=res+hund[(num%1000)/100];
        res=res+tens[(num%100)/10];
        res=res+ones[num%10];
        return res;
    }
}
