import java.util.*;
public class QueueB{
  static class Stack{
    Deque<Integer> q = new LinkedList<>();

  public boolean isEmpty(){
    return q.isEmpty();
  }

    public void push(int data){
      q.addLast(data);
    }

    public int pop(){
      return q.removeLast();
    }

    public int peek(){
      return q.getLast();
    }
  }
  public static void main(String args[]){
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    System.out.println("peek = " + s.peek());

    while(!s.isEmpty()){
      System.out.println(s.pop()+" ");
    }
  }
}

//Implementing Stack using Deque