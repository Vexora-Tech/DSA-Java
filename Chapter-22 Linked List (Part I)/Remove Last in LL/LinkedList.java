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

  //remove Last in LL
  public int removeLast(){
    if(size == 0){
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    }else if(size == 1){
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }

    //prev : i = size-2
    Node prev = head;
    for(int i=0; i<size-2; i++){
      prev = prev.next; 
    }

    int val = prev.next.data;   //tail.data
    prev.next = null;
    tail = prev;
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
    ll.removeLast();
    ll.print();      
    System.out.println("size is " + ll.size);   
  }
}
//Remove Last in LL