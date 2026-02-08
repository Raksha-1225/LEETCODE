class Solution {
    public int pivotInteger(int n) {
        int id=-1;
        for(int i=1;i<=n;i++){
            int ls=0;
            int rs=0;
            for(int j=1;j<=i;j++){
                ls=ls+j;
            }
            for(int j=i;j<=n;j++){
                rs=rs+j;
            }
            if(ls==rs){
                id=i;
                break;
            }
        }
        return id;
        
    }
}