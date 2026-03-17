class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String r=tokens[i];
            if(!r.equals("+")&&!r.equals("-")&&!r.equals("/")&&!r.equals("*")){
                st.push(Integer.parseInt(r));
            }
            else{
                int a=st.pop();
                int b=st.pop();
                if(r.equals("+")){
                   st.push(a+b);
                }
                else if(r.equals("-")){
                    st.push(b-a);
                }
                else if(r.equals("*")){
                    st.push(a*b);
                }
                else{
                    st.push(b/a);;
                }
            }
        }
        return st.peek();
    }
}