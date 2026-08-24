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

  public void addFirst(int data){
    //step 1 - create new Node
    Node newNode = new Node(data);

    if(head == null){
      head = tail = newNode;
      return;
    }

    //step 2 - newNode next = head
    newNode.next = head;

    //step 3 - head = newNode
    head = newNode;  
  }

  public void print(){   //O(n)
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.addFirst(2);
    ll.addFirst(1);
    ll.print();
  }
}
//Print a LL
