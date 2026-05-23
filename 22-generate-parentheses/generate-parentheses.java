class Solution {
    public List<String> result=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate(0,0,"",n);
        return result;
    }
    public void generate(int op,int cl,String s,int n){
        if(s.length()==n*2){
            result.add(s);
            return;
        }
        if(op<n){
            generate(op+1,cl,s+"(",n);
        }
        if(cl<op){
            generate(op,cl+1,s+")",n);
        }
    }
}