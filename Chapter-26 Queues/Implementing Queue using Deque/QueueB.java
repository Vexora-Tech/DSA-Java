import java.util.*;
public class QueueB{
  static class Queue{
    Deque<Integer> q = new LinkedList<>();

  public boolean isEmpty(){
    return q.isEmpty();
  }

    public void add(int data){
      q.addLast(data);
    }

    public int remove(){
      return q.removeFirst();
    }

    public int peek(){
      return q.getFirst();
    }
  }
  public static void main(String args[]){
    Queue s = new Queue();
    s.add(1);
    s.add(2);
    s.add(3);
    s.add(4);
    s.add(5);
    System.out.println("peek = " + s.peek());

    while(!s.isEmpty()){
      System.out.println(s.remove()+" ");
    }
  }
}

//Implementing Queue using Deque