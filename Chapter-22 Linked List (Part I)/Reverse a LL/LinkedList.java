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

  public static int size;

  public void addFirst(int data){
    //step 1 - create new Node
    Node newNode = new Node(data);
    size++;

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

  //reverse a Linked List
  public void reverse(){
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    head = prev;
  }

  public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.print();
    ll.reverse();
    ll.print();
  }
}
//Reverse a LL