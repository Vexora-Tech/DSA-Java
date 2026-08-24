import java.util.*;
public class LinkedList{
  public static class Node {
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addLast(int data){
    //step 1 - create new Node
    Node newNode = new Node(data);

    if(head == null){
      head = tail = newNode;
      return;
    }

    //step 2 - newNode next = head
    tail.next = newNode;

    //step 3 - head = newNode
    tail = newNode;  
  }

  public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.addLast(1);
    ll.addLast(2);
  }
}
//Add Last in LL
