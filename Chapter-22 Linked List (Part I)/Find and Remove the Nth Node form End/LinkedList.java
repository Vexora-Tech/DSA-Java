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

  public void deleteNthfromEnd(int n){
    //calculate size
    int sz = 0;
    Node temp = head;

    while(temp != null){
      temp = temp.next;
      sz++;
    }

    if(n == sz){    //remove first
      head = head.next;
      return;
    }

    //sz-n
    int i = 1;
    int iToFind = sz-n;
    Node prev = head;
    while(i < iToFind){
      prev = prev.next;
      i++;
    }

    prev.next = prev.next.next;
    return;
  }

  public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.print();
    ll.deleteNthfromEnd(1);
    ll.print();
  }
}
//Find and Remove the Nth Node form End