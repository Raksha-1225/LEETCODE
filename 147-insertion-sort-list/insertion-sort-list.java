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
    public ListNode insertionSortList(ListNode head) {
        int count=0;
        ListNode temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int arr[]=new int[count];
        temp=head;
        for(int i=0;i<count;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }

        Arrays.sort(arr);
        ListNode head2=new ListNode(arr[0]);
        ListNode tail=head2;

        for(int i=1;i<count;i++){
            ListNode newNode=new ListNode(arr[i]);
            tail.next=newNode;
            tail=newNode;
        }

        return head2;

        
    }
}