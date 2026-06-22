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
    public ListNode doubleIt(ListNode head) {

        Stack<Integer> st=new Stack<>();

        int carry=0;

        while(head!=null){
            st.push(head.val);
            head=head.next;
        }

        ListNode doubleList=null;
 
        while(!st.isEmpty()||carry!=0){

            ListNode newNode = new ListNode(0);
            newNode.next=doubleList;
            doubleList=newNode;

            if(!st.isEmpty()){
                carry=carry+(st.pop()*2);
            }
            doubleList.val=carry%10;
            carry=carry/10;

        }

        return doubleList;

        
    }
}