/*
  Print elements of a linked list in reverse order 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node last = null; // Set the last node of the List as null. 
    if(head == last) // The function (ReversePrint) is invoked until it reaches the last node of the List
        return;
        ReversePrint(head.next); // When it reaches the last Node, the function passes a NULL, and invokes function (ReversePrint)
        System.out.println(head.data); // and it Print the data of the Node
    }
