class Solution{
    public int[][] flipAndInvertImage(int[][] image){
        int rows=image.length;
        int cols=image[0].length;
        for(int i=0;i<rows;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<cols;j++){
                sb.append(image[i][j]);
            }
            sb.reverse();
            for(int j=0;j<cols;j++){
                char c=sb.charAt(j);
                sb.setCharAt(j,c=='0'?'1':'0');
                image[i][j]=sb.charAt(j)-'0';
            }
        }
        return image;
    }
}