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

  //remove fisrt in LL
  public int removeFirst(){
    if(size == 0){
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    }else if(size == 1){
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.print();
    System.out.println("size is " + ll.size);   
    ll.removeFirst();
    ll.print();      
    System.out.println("size is " + ll.size);   
  }
}
//Remove FIrst in LL