class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> S=new Stack<>();
        Stack<Character> T=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='#'){
                if(!S.isEmpty())
                    S.pop();
            }
            else{
                S.push(c);
            }
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(c=='#'){
                if(!T.isEmpty())
                    T.pop();
            }
            else{
                T.push(c);
            }
        }
        while(!S.isEmpty()&&!T.isEmpty()){
            char c1=S.pop();
            char c2=T.pop();
            if(c1!=c2){
                return false;
            }
        }
        return T.isEmpty()&&S.isEmpty();
    }
}