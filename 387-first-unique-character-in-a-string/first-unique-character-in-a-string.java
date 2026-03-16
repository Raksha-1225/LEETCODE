class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        for(char i:map.keySet()){
            if(map.get(i)==1){
                return s.indexOf(i);
            }
        }
        return -1;
        
    }
}
