import java.util.*;
public class StackB{
  // A stack is a linear data structure that follows LIFO (Last In, First Out) order — the last element added is the first
  // one removed. Think of a stack of plates: you add and remove from the top only.
  // Core Operations

  // Operation           Description.                                 Time Complexity
  // push(x)        ->   Add element x to the top.                   O(1)
  // pop()          ->   Remove and return the top element           O(1)
  // peek() / top() ->   View the top element without removing it.   O(1)
  // isEmpty()      ->   Check if the stack has no elements.         O(1)
  // size()         ->   Number of elements currently in the stack.  O(1)

//All operations happen at one end (the "top"), which is why they're all O(1) — no shifting of other elements needed.

public static void main(String args[]){

  Stack<Integer> s = new Stack<>();
  s.push(10);
  s.push(20);
  System.out.println(s.pop());  // 20
  System.out.println(s.peek()); // 10

  }
}

//Stack Introduction