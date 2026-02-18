import java.util.*;

public class JavaBasics{
  public static int calculateSum(int num1, int num2){
    int sum = num1 + num2;
    return sum;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = calculateSum(a, b);
    System.out.println(sum);
  } 
}
//Syntax with Parameters

//syntax
//returnType name(type param1, type param2){
    //body
    //return statement;
//}

