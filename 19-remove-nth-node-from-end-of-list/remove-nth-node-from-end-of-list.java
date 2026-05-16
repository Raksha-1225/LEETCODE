class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        n=(c-n);
        if(n==0){
            return head.next;
        }
        temp=head;
        c=0;
        while(temp!=null){
           c++;
           if(c==n){
                temp.next=temp.next.next;
                break;
           }
           temp=temp.next;
        }
       return head;
    }
}