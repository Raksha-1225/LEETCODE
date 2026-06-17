class Solution {
    

    public static void row1(String s,ArrayList<String> al){
        for(int i=0;i<s.length();i++){
            String c=""+Character.toLowerCase(s.charAt(i));
            if( "qwertyuiop".contains(c)){
                continue;
            }
            return;
        }
        al.add(s);
    }

    public static void row2(String s,ArrayList<String> al){
        for(int i=0;i<s.length();i++){
            String c=""+Character.toLowerCase(s.charAt(i));
            if("asdfghjkl".contains(c)){
                continue;
            }
            return;
        }
        al.add(s);
        
    }

    public static void row3(String s,ArrayList<String> al){
        for(int i=0;i<s.length();i++){
            String c=""+Character.toLowerCase(s.charAt(i));
            if("zxcvbnm".contains(c)){
                continue;
            }
            return;
        }
        al.add(s);
        
    }

    public String[] findWords(String[] words) {
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if("qwertyuiop".contains(Character.toLowerCase(words[i].charAt(0))+"")){
                row1(words[i],al);
            }
            else if("asdfghjkl".contains(Character.toLowerCase(words[i].charAt(0))+"")){
                row2(words[i],al);
            }
            else{
                row3(words[i],al);
            }

        }
        String res[]=new String[al.size()];
        for(int i=0;i<al.size();i++){
            res[i]=al.get(i);
        }
        return res;
    }
}