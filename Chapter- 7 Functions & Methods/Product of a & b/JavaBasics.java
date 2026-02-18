import java.util.*;

public class JavaBasics{
  public static int multiply(int num1, int num2){   
    int prod = num1 * num2;
    return prod;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int prod = multiply(a, b);  
    System.out.println(prod);
  } 
}
//Product of a & b

