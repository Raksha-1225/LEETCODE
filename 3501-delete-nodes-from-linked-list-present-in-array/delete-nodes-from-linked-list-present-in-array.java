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
    public ListNode modifiedList(int[] nums, ListNode head) {

       HashSet<Integer> al=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
        }
        ListNode newHead=new ListNode(0);
        ListNode tail=newHead;
        ListNode temp=head;
        while(temp!=null){
            if(!al.contains(temp.val)){
                ListNode newNode=new ListNode(temp.val);
                tail.next=newNode;
                tail=newNode;
            }
            temp=temp.next;
        }

        return newHead.next;


        
    }
}