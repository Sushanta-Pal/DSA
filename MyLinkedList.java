class MyLinkedList {
 /**
  * InnerMyLinkedList
  */
 public class node {
    int val;
    node next;
    node(int val){
  this.val=val;
 this.next=null;
    }
 }
  int idx;
  node head;
  node tail;
    public MyLinkedList() {
        idx=-1;
        head = null;
        head = tail;
    }
    
    public int get(int index) {
        if (index<0 ||index>idx) {
            return -1;
        }
        node curr=head;
        while (index>0) {
            curr=curr.next;
            index--;
        }

        return curr.val;
    }
    
    public void addAtHead(int val) {
        idx++;
        if (head==null) {
            head=tail=new node(val);
            return;
        }
        node newNode =new node(val);
        newNode.next=head;
        head=newNode;
    }
    
    public void addAtTail(int val) {
        idx++;
         if (head==null) {
            head=tail=new node(val);
            return;
        }
        node newNode =new node(val);
        tail.next=newNode;
        tail=newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if (index<0 ||index>idx+1) {
            return;
        }
        
         if (index==0) {
           addAtHead(val);
           return;
        }
         if (index==idx+1) {
           addAtTail(val);
           return;
        }
        idx++;
        node curr=head;
        node pre=curr;
        while (index>0) {
            pre=curr;
            curr=curr.next;
            index--;
        }
        node newNode =new node(val);
        newNode.next=curr;
        pre.next=newNode;
    }
    
    public void deleteAtIndex(int index) {
         if (index<0 ||index>idx) {
            return;
        }
        if (index==0) {
           head=head.next;
           idx--;
           return; 
        }
        node curr=head;
        node pre=null;
        while (index>0) {
             pre=curr;
            curr=curr.next;
            index--;
        }
        if (curr==tail) {
            pre.next=null;
            tail=pre;
        idx--;
        return;
        }
        pre.next=curr.next;
        idx--;
    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
    System.out.println( myLinkedList.get(1));;              // return 2
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
       System.out.println( myLinkedList.get(1));;              // return 3
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