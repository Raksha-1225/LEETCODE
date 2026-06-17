class Solution {
   
    static String s1="qwertyuiop";
    static String s2="asdfghjkl";
    static String s3="zxcvbnm";
    public static void row1(String s,ArrayList<String> al){
        for(int i=0;i<s.length();i++){
            String c=""+Character.toLowerCase(s.charAt(i));
            if(s1.contains(c)){
                continue;
            }
            return;
        }
        al.add(s);
    }

    public static void row2(String s,ArrayList<String> al){
        for(int i=0;i<s.length();i++){
            String c=""+Character.toLowerCase(s.charAt(i));
            if(s2.contains(c)){
                continue;
            }
            return;
        }
        al.add(s);
        
    }

    public static void row3(String s,ArrayList<String> al){
        for(int i=0;i<s.length();i++){
            String c=""+Character.toLowerCase(s.charAt(i));
            if(s3.contains(c)){
                continue;
            }
            return;
        }
        al.add(s);
        
    }

    public String[] findWords(String[] words) {
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(s1.contains(Character.toLowerCase(words[i].charAt(0))+"")){
                row1(words[i],al);
            }
            else if(s2.contains(Character.toLowerCase(words[i].charAt(0))+"")){
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