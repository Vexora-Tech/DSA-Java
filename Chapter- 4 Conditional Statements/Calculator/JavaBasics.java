import java.util.*;

public class JavaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number : ");
    int a = sc.nextInt(); 
    System.out.print("Enter second number : ");
    int b = sc.nextInt(); 
    System.out.print("Enter operator : ");
    char operator = sc.next().charAt(0); 
    switch(operator){
      case '+' :System.out.println("sum is : " + (a + b));
            break;
      case '-' :System.out.println("substract is : " + (a - b));
            break;
      case '*' :System.out.println("multiple is : " + (a * b));
            break;
      case '/' :System.out.println("product is : " + (a / b));
            break;     
      case '%' :System.out.println("modulo(remainder) is : " + (a % b));
            break; 
      default : System.out.println("Wrong Operator");      
    }
  } 
}
//Calculator
