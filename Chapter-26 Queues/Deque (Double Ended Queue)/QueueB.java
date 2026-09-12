import java.util.*;
public class QueueB{
  public static void main(String args[]){
    Deque<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q);

    //first element
    q.removeFirst();
    System.out.println(q);

    //last element
    q.removeLast();
    System.out.println(q);

    System.out.println("first element = "+ q.getFirst());
    System.out.println("Last element = "+ q.getLast());

  }
}

//Deque (Double Ended Queue)