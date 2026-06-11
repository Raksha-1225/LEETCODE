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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }

        ListNode temp=head;
        HashMap<Integer,Integer> h=new HashMap<>();
        while(temp!=null){
            if(!h.containsKey(temp.val)){
                h.put(temp.val,1);
            }
            else{
                h.put(temp.val,h.get(temp.val)+1);
            }
            temp=temp.next;
        }

        ListNode dummy1=new ListNode(0);
        dummy1.next=head;
        ListNode dummy2=dummy1;
        temp=head;
        while(temp!=null){
            if(h.get(temp.val)>1){
                dummy2.next=temp.next;
            }
            else{
                dummy2=temp;
            }
            temp=temp.next;
        }

        return dummy1.next;
       
        
    }
}