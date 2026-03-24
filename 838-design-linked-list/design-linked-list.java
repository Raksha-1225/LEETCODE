class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            next=null;
            prev=null;
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
            head.prev=newNode;
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
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
        count++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0||index>count){
            return;
        }

        if(index==0){
            addAtHead(val);
            return;  
        }
        else if(index==count){
            addAtTail(val);
            return;  
        }

        Node newNode=new Node(val);
        Node temp=head;

        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }

        newNode.prev=temp;
        newNode.next=temp.next;

        temp.next=newNode;

        if(newNode.next!=null){    
            newNode.next.prev=newNode;
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
            else{
                head.prev=null;
            }
        }
        else if(index==count-1){
            tail=tail.prev;
            if(tail!=null){   
                tail.next=null;
            }
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(temp.next!=null){   
                temp.next.prev=temp;
            }
        }
        count--;
    }
}