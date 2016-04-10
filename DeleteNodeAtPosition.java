/*
  Delete Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    if(position == 0){
        head = head.next;
        return head;
    }
    Node n = head;
    int i = 0;
    while(n.next!=null){
        if(i==position-1){
            n.next = n.next.next;
            return head;
        }
        i = i +1;
        n = n.next;
    }
return head;
}