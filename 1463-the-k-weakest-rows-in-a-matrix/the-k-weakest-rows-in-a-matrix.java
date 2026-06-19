class Solution {
    public int[] kWeakestRows(int[][] mat,int k) {
        int[][] arr=new int[mat.length][2];
        for(int i=0;i<mat.length;i++) {
            int count=0;
            for(int j=0;j<mat[0].length;j++) {
                if(mat[i][j]==1) {
                    count++;
                }
            }
            arr[i][0]=count;
            arr[i][1]=i;
        }

        for(int i=0;i<mat.length-1;i++) {
            for(int j=0;j<mat.length-i-1;j++) {
                if(arr[j][0]>arr[j+1][0]||(arr[j][0]==arr[j+1][0]&&arr[j][1]>arr[j+1][1])) {
                    int temp0=arr[j][0];
                    int temp1=arr[j][1];
                    arr[j][0]=arr[j+1][0];
                    arr[j][1]=arr[j+1][1];
                    arr[j+1][0]=temp0;
                    arr[j+1][1]=temp1;
                }
            }
        }

        int[] ans=new int[k];
        for(int i=0;i<k;i++) {
            ans[i]=arr[i][1];
        }

        return ans;
    }
}