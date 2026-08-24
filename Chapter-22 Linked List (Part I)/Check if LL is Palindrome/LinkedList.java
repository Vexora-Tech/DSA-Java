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

  //slow-fast Approach
  public Node findMId(Node head){   //helper function
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
      slow = slow.next; //+1
      fast = fast.next.next;  //+2
    }
    return slow;  //slow is midNode
  }


  public boolean checkPalindrome(){
    if(head == null || head.next == null){
      return true;
    }

    //step 1 - find mid
    Node midNode = findMId(head);

    //setp 2 - reverse the 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;
    while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node right = prev; //right half head
    Node left = head;

    //step 3 - check left half and right half
    while(right != null){
      if(left.data != right.data){
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
  }

  public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.print();
    System.out.println(ll.checkPalindrome());
  }
}
//Check if LL is Palindrome