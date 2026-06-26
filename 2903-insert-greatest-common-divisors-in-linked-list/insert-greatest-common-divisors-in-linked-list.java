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

    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode temp=head;

        while(temp.next!=null){
            int a=temp.val;
            int b=temp.next.val;
            int hcf=gcd(a,b);
            ListNode t=temp.next;
            ListNode newNode=new ListNode(hcf);
            temp.next=newNode;
            newNode.next=t;
            temp=t;
        }
        return head;
        
    }
}