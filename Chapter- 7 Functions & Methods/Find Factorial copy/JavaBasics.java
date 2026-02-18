import java.util.*;

public class JavaBasics{
  public static int Factorial(int num){
    int f = 1;
    for(int i=1; i<=num; i++){
      f = f * i;
    }
    return f;   //factorial of n
    
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    System.out.println(Factorial(n));
  } 
}
//Find Factorial

