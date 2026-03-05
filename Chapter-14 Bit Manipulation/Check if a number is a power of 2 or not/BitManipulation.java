public class BitManipulation{
  public static boolean isPowerofTwo(int n){
    return (n & (n-1)) == 0;
  }
  
  public static void main(String args[]){
    System.out.println(isPowerofTwo(8));
    System.out.println(isPowerofTwo(3));
  }
}
//Check if a number is a power of 2 or not