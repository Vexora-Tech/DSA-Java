public class Complexity{
  public static void main(String args[]){
    //Q1
    int i, j, k = 0;
    for(i=n/2; i<=n; i++){
      for(j=2; j<=n; j=j*2){
        k = k + n/2;
      }
    }
    //Option A -> Time complexity = O(n*logn)
    // In the loop, j keeps doubling till it is less than or equal to n.
    // Several times, we can double a number till it is less than n would be log(n).
    // Let's take the examples here:
      for n = 16, j = 2, 4, 8, 16
      for n = 32, j = 2, 4, 8, 16, 32
    // So, j would run for O(log n) steps.
    // i runs for n/2 steps.
    // So, total steps = O(n/2 * log(n)) = O(n * log n)


    //Q2
    for(int i=0; i<n; i++){
      i*=k;
    }
    //Option C -> Time complexity = O(logkn)
    //Because loops for the kn-1 times, so after taking log it becomes logkn


    //Q3
    //Algorithm A and B have a worst-case running time of O(n) and O(logn), respectively. 
    //Therefore, algorithm B always runs faster than algorithm A.
    
    //Option B. -> false 
    //The Big-O notation provides anasymptotic comparison in the running time of algorithms. For n < n0 , algorithm A might run faster than algorithm B, for instance.


    //Q4
    class SqrtNum
    static int floorSqrt(int x){
      if (x == 0 || x == 1)
        return x;

      int i = 1, result = 1;

      while (result <= x){
        i++;
        result = i * i;
      }
      return i - 1;
    }

    public static void main(String[] args){
      int x = 11;
      System.out.print(floorSqrt(x));
    }

    //Time complexity - O(√n)
    //Space complexity - O(1)


    //Q5
  int a = 0;
  for (int i = 0; i < n; ++i){
    for (int j = n; j > i; --j){
      a = a + i + j;
    }
  }

  //Time complexity - O(n^2)
  //Space complexity - O(1)
  }
}