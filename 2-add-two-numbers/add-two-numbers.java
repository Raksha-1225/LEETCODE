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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode head=l3;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int v1;
            if(l1!=null){
                v1=l1.val;
            }
            else{
                v1=0;
            }

            int v2;
            if(l2!=null){
                v2=l2.val;
            }
            else{
                v2=0;
            }
            int sum=v1+v2+carry;
            carry=sum/10;
            l3.next=new ListNode(sum%10);
            l3=l3.next;
            l1=(l1!=null)?l1.next:null;
            l2=(l2!=null)?l2.next:null;
        }
        return head.next;
        
    }
}