 class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        } 
        int size=0;
        ListNode t=head;
        while(t!=null){
            size++;
            t=t.next;
        }
        k=k%size;
        int ct=0;
        while(ct!=k){
            ListNode temp=head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            ListNode tail=temp.next;
            tail.next=head;
            head=tail;
            temp.next=null;
            ct++;
        }
        return head;
    }
}