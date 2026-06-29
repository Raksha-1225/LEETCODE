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
    public ListNode mergeNodes(ListNode head) {
        ListNode newHead=new ListNode(0);
        ListNode tail=newHead;
        ListNode temp=head.next;
        int sum=0;
        while(temp!=null){
            sum=sum+temp.val;
            temp=temp.next;
            if(temp!=null&&temp.val==0){
                ListNode newNode=new ListNode(sum);
                tail.next=newNode;
                tail=newNode;
                sum=0;
            }

         
        
        }
            return newHead.next;
        
    }
}