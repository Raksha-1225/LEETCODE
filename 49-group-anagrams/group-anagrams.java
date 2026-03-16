class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        Map<String,List<String>> map=new LinkedHashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String r=new String(ch);
            if(!map.containsKey(r)){
                map.put(r,new ArrayList<>());
            }
            map.get(r).add(s);
        }
        for(String c:map.keySet()){
            list.add(map.get(c));
        }
        return list;
        }


        
    }
