class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")||operations[i].equals("D")||operations[i].equals("+")){
                String c=operations[i];
                switch(c){
                    case "C":
                       st.pop();
                       break;
                    case "D":
                      st.push(2*st.peek());
                      break;
                    case "+":
                      int a=st.pop();
                      int b=st.peek();
                      int sum=a+b;
                      st.push(a);
                      st.push(sum);
                      break;   }  }
            else{
                st.push(Integer.parseInt(operations[i]));    }  }
        int total=0;
        while(!st.isEmpty()){
            total=total+st.pop();
        }
        return total; 
    }
}