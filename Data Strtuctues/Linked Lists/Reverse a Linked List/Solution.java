/*
  Reverse a linked list and return pointer to the head
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
    // Make the <head> of the list as <currentNode>
    Node currentNode = head;
    Node prevNode = null;
    Node nextNode = null;
    
    // the while loop will run until we reach the last node which points -> NULL
    while(currentNode != null){
        nextNode = currentNode.next; // <currentNode> is head, <currentNode.next> will be our <nextNode>
        currentNode.next = prevNode; // prevNode is currently <NULL>
        // Update the nodes: prevNode and currentNode, respectively
        prevNode = currentNode; // Our <currentNode> node is <head>, make this as <prevNode>
        currentNode = nextNode; // and, set the <nextNode> as your <currentNode> Node
    }
    return prevNode;

}
