public class RecursionBasics{
  public static int fib(int n) {
    if (n == 0 || n == 1){
      return n;
    }
    int fnm1 = fib(n-1);
    int fnm2 = fib(n-2);
    int fb = fnm1 + fnm2;
    return fb;
  }  
  public static void main(String args[]){
    int n = 25;
    System.out.print(fib(n));
  }
}
//Print Nth fibonacci Number