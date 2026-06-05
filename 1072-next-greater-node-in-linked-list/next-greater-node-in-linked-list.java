/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
         
        ListNode curr=head;
        ListNode next=null;
        ListNode prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        st1.push(0);
        st2.push(prev.val);
        ListNode temp=prev.next;
        while(temp!=null){
             while(!st2.isEmpty()&&st2.peek()<=temp.val){
                st2.pop();
             }
             if(st2.isEmpty()){
                st1.push(0);
             }
             else{
                st1.push(st2.peek());
             }
             st2.push(temp.val);
             temp=temp.next;
        }
        int n=st1.size();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=st1.pop();
        }
        return arr;

        


        
    }
}