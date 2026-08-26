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

  public void zigZag(){
    //Find Mid
    Node slow = head;
    Node fast = head.next;
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    Node mid = slow;

    //Reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;

    while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node left = head;
    Node right = prev;
    Node nextL, nextR;

    //alt merge - zig-zag merge
    while(left != null && right != null){
      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;

      left = nextL;
      right = nextR;
    }

  }

  public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
    ll.addFirst(6);

    ll.print();
    ll.zigZag();
    ll.print();
  }
}

//Zig Zag LL
