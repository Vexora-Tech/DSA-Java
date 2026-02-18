import java.util.*;

public class JavaBasics{
  //number is prime or not
  public static boolean isprime(int n){
    //corner cases
    if(n < 2){
      return true;
    }

    for(int i=2; i<=Math.sqrt(n); i++){
      if(n % i == 0 ){    //completly divide
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]){
    System.out.println(isprime(6));
  } 
}
//Check Prime (Optimized)
