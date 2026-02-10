
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);  
        Arrays.sort(s);   
        int c = 0;
        int id = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = id; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    c++;          
                    id = j + 1;  
                    break;
                }
            }
        }
        return c;
    }
}