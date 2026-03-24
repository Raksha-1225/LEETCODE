class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            next=null;
        }
    }
    Node head;
    Node tail;
    int count;
    public MyLinkedList() {
        head=null;
        tail=null;
        count=0;
    }
    
    public int get(int index) {
        if(index<0||index>=count){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
        
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        count++;
        
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        count++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0||index>count){
            return;
        }
        Node newNode=new Node(val);
        if(index==0){
            newNode.next=head;
            head=newNode;
        }
        else if(index==count){
            tail.next=newNode;
            tail=newNode;
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        count++;

        
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=count){
            return;
        }
        if(index==0){
            head=head.next;
            if(head==null){
                tail=null;
            }
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(temp.next==null){
                tail=temp;
            }
        }
        count--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */