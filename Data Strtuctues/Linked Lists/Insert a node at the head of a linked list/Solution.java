/*
  Insert Node at the beginning of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission. 
// You only need to complete this method. 

Node Insert(Node head,int x) {
    
    Node newNode = new Node(); // create a new empty Node
    
    newNode.data = x;       // set the data of the new node as current data "x"
    newNode.next = head;   // make next of the new node as head
    head = newNode;       // move the head to the new node
    
    return newNode; 
    
}
    
        
  }