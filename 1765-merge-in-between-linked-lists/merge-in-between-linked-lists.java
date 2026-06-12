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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
          
        int count=0;
        ListNode temp=list1;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        if(count<a||count<b){
            return list1;
        } 

        ListNode t1=list1;
        int c=0;

        while(c<a-1){
            t1=t1.next;
            c++;
        }

        ListNode head1=t1;

        while(c<b){
            t1=t1.next;
            c++;
        }

        ListNode head2=t1.next;

        temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
    

        head1.next=list2;
        temp.next=head2;
        return list1;









        
    }
}