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
    public void reorderList(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
      
        ListNode curr=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode h1=head;
        ListNode h2=prev;
        while(h2!=null){
            ListNode tp1=h1.next;
            ListNode tp2=h2.next;
            h1.next=h2;
            h2.next=tp1;
            h1=tp1;
            h2=tp2;
        }
       

        
        
    }
}