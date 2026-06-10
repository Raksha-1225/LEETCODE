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
    public ListNode reverseBetween(ListNode head,int left,int right) {

        int count=0;
        ListNode temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        if(left>count||right>count){
            return head;
        }

        if(left==1){

            ListNode curr=head;
            ListNode prev=null;
            ListNode next=null;
            int pos=1;
            while(pos<=right){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                pos++;
            }
            head.next=curr;
            return prev;
        }
        

        else{

        count=1;
        temp=head;
        while(count<left-1){
            count++;
            temp=temp.next;
        }

        ListNode head1=temp;
        ListNode leftNode=temp.next;

        temp=temp.next;
        count=left;

        while(count<right){
            count++;
            temp=temp.next;
        }

        ListNode head2=temp.next;
        ListNode curr=leftNode;
        ListNode prev=null;
        ListNode next=null;

        int l=left;

        while(l<=right){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            l++;
        }

        head1.next=prev;
        leftNode.next=head2;
        return head;
        }
    }
}