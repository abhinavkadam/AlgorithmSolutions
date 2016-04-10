  /*Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    
    if(head == null){
        return null;
    }
    
    else {
            Node n = head;
            Node prev = null;
            Node nextNode = null;
            while(n.next!=null){
                nextNode = n.next;
                n.next = prev;
                prev = n;
                n = nextNode;
            }
            n.next = prev;

        return n;
    }
}