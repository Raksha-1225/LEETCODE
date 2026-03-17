class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c=='('||c=='{'||c=='[')){
                st.push(c);
            }
            else if(!st.isEmpty() && (
        (c==')' && st.peek()=='(') ||
        (c=='}' && st.peek()=='{') ||
        (c==']' && st.peek()=='['))){
            st.pop();
            }
            else if(st.isEmpty()&&(c==')'||c==']'||c=='}')){
                return false;
            }
            else{
                return false;
            }
        }
        return st.isEmpty();
        
    }
}