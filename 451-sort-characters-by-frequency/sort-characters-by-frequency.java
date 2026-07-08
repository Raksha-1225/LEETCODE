class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!h.containsKey(ch)){
                h.put(ch,1);
            }
            else{
                h.put(ch,h.get(ch)+1);
            }
        }
        ArrayList<Character> al=new ArrayList<>(h.keySet());
        al.sort((a,b)->h.get(b)-h.get(a));
        String res="";
        for(char c:al){
            for(int i=0;i<h.get(c);i++){
                res=res+c;
            }
        }
        return res;


    }
}