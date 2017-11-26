/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
/*
  Delete Node at a given position in a linked list 
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
    
    if(head == null){
        return null;
    }
  
    if(position == 0){
       return head.next;
    }   
    Node newNode = head;
    int count = 0;
    while(count < position -1){
        newNode = newNode.next;
        count ++;
    }
    newNode.next = newNode.next.next;
    return head;

}

