public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1;
        int h=n;
        while (l<=h) {
            int mid=l+(h-l)/2;
            int g=guess(mid);
            if (g==0){
                return mid;  
            } 
            else if(g==1){
                l=mid+1; 
            } 
            else{
                h=mid-1;  
            }
        }
        return -1;
    }
}
