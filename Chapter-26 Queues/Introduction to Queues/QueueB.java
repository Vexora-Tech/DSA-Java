import java.util.*;
public class QueueB{ 
  public static void main(String args[]){
// Introduction to Queues

// A Queue is a linear data structure that follows FIFO — First In, First Out. The element inserted first is the one removed first, just like a line of people waiting at a ticket counter.

// Core Idea
// Think of a queue like a line at a coffee shop:
    // New customers join at the back (rear/tail)
    // Service happens from the front (head)
    // No cutting in line — you can only remove from the front and add at the back

// This is the opposite of a Stack (LIFO), which you've already worked through.


  Key Operations:
  Operation               Description                          Time Complexity
  enqueue(x)           Add element x to the rear                    O(1)
  dequeue()            Remove and return front element              O(1)
  peek() / front()     View front element without removing          O(1)
  isEmpty()            Check if queue has no elements               O(1) 
  size()               Number of elements in queue                  O(1)

  }
}

//Introduction to Queues