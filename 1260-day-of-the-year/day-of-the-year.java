class Solution {
    public int dayOfYear(String date) {
        
        String s[]=date.split("-");
        int day=Integer.parseInt(s[2]);
        int month=Integer.parseInt(s[1]);
        int year=Integer.parseInt(s[0]);
        int res=0;
        for(int i=1;i<=month;i++){

            if((i==1||i==3||i==5||i==7||i==8||i==10||1==12)&&i!=month){
                res=res+31;
            }

            else if(i==2&&i!=month){
                if((year%4==0&&year%100!=0)||year%400==0){
                    res=res+29;
                }
                else{
                    res=res+28;
                }
            }

            else if((i==4||i==6||i==9||i==11)&&i!=month){
                res=res+30;
            }

            else{
                res=res+day;
            }
            
        }
        return res;
    }
}