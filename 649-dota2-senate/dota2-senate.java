class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad=new LinkedList<>();
        Queue<Integer> dire=new LinkedList<>();
        for(int i=0;i<senate.length();i++){
            char c=senate.charAt(i);
            if(c=='R'){
                rad.offer(i);
            }
            else{
                dire.offer(i);
            }
        }
        int n=senate.length();
        while(!rad.isEmpty()&&!dire.isEmpty()){
            int r=rad.poll();
            int d=dire.poll();
            if(r<d){
                rad.offer(r+n);
            }
            else{
                dire.offer(d+n);
            }
        }
        return rad.isEmpty()?"Dire":"Radiant";
        
    }
}