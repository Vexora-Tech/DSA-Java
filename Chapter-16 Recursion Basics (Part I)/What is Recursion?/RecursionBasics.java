// Recursion is when a function calls itself as part of its own definition, solving a problem by breaking it into smaller versions of the same problem.
// The key idea: Each recursive call works on a simpler version of the problem, until it reaches a base case — a condition simple enough to solve directly without another recursive call.


public class RecursionBasics{
  public static int factorial(int n) {
    if (n == 0)           // base case
      return 1;
    return n * factorial(n - 1);  // recursive call
  }
  public static void main(String args[]){
    System.out.println(factorial(4));  // Output: 24
  }
}  


// Calling `factorial(4)` unfolds like this:

// factorial(4)
//   → 4 * factorial(3)
//        → 3 * factorial(2)
//             → 2 * factorial(1)
//                  → 1 * factorial(0)
//                       → 1  ← base case


//Two essential parts:
//1. Base case — stops the recursion (prevents infinite loops)
//2. Recursive case — calls itself with a simpler input, moving toward the base case

//What is Recursion?

