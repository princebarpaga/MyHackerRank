/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
    // This is a "method-only" submission. 
    // You only need to complete this method. 
    
    Node newNode = new Node(); // Create a new node with data and next pointer -> null
    newNode.data = data;
    newNode.next = null;

    if(head == null){  // check if the head is null, then return the newNode created.
        return newNode;
    }  
     /* Start from position 0,
     and make the newly added Node as head of the List.
    */
    if(position == 0){ 
        newNode.next = head; 
        return newNode;
    } 
    
    /*In order to delete, 
     we need to find the previous of 
     the Node to be deleted
    */
    else{           
        Node prev = head; // Set the Head as previous node 
        int count = 0; 
        // Start from position 0 until you find the previous node which will be (position - 1)
        while (count < position -1 ){
            prev = prev.next; // prev.next is our current node, we want to inser our node, between prev & prev.next
            count ++;
        }     
        //The loop will exit once the position of the Node to be inserteed has been found
        newNode.next = prev.next; // Set the pointer of the newNode to the current one (prev.next)
        prev.next = newNode;  //Update the current node (prev.next) to the newly added node (newNOde)
        return head;    
    }    
}
