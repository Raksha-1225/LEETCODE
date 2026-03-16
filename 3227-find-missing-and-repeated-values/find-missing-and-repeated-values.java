class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        ArrayList<Integer> al=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        int res[]=new int[(n*m)+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[grid[i][j]]++;
            }
        }
        for(int i=1;i<res.length;i++){
            if(res[i]>1){
                al.add(i);
            }
        }
         for(int i=1;i<res.length;i++){
            if(res[i]==0){
                al.add(i);
            }
        }
        int result[]=new int[al.size()];
        for(int i=0;i<al.size();i++){
            result[i]=al.get(i);
        }
        return result;
        
    }
}