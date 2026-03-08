public class RecursionBasics{
  public static int optimizedPower(int x, int n) {
    if (n == 0){
      return 1;
    }
    int halfPower = optimizedPower(x, n/2);
    int halfpowerSqr = halfPower * halfPower;

    // n is odd
    if(n % 2 != 0){
      halfpowerSqr = x * halfpowerSqr;
    }

    return halfpowerSqr;
  }  
  public static void main(String args[]){
    System.out.print(optimizedPower(2, 10));
  }
}
//Print x to the power n (optimized)