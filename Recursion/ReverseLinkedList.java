class ReverseLinkedList{
 static class Node{
   int data ;
   Node next ;
   public Node(int data){
     this.data = data ;
     next = null ;
   }
 }

  public static Node reverseList(Node head){
   if(head == null){
     return head ;
   }
  }

  public static void printList(Node head){
    Node temp = head ;

    while(temp != null){
      System.out.print(temp.data + "->") ;
      temp = temp.next ;
    }
  }

  public static void main(String[] args){
    Node head = new Node(0) ;
    head.next = new Node(5) ;
    head.next.next = new Node(4) ;
    head.next.next.next = new Node(3) ;
    head.next.next.next.next = new Node(2) ;
    head.next.next.next.next.next = new Node(1) ;

    printList(head);

  }
}
