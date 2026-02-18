import java.util.*;

public class JavaBasics{
  //Q1
  public static double average(double a, double b, double c){
    return (a + b + c) / 3;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter first number : ");
    double a = sc.nextDouble();
    System.out.print("enter second number : ");
    double b = sc.nextDouble();
    System.out.print("enter third number : ");
    double c = sc.nextDouble();
    System.out.println("average of three number is " + average(a,b,c));
  } 

  //Q2
  public static String isEven(int num){
    if(num % 2 == 0){
      return "Even";
    }
    return "odd";
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int num = sc.nextInt();

    System.out.println("the number is : " + isEven(num));
  }

  //Q3
  public static void reverse(int num) {
    int mynum = num;
    int rev = 0;

    while (num > 0) {
        int lastdigit = num % 10;
        rev = (rev * 10) + lastdigit;
        num = num / 10;
    }

    if (mynum == rev) {  
        System.out.println("number : " + mynum + " is a palindrome");
    } else {             
        System.out.println("number : " + mynum + " is not a palindrome");
    }
}

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int a = sc.nextInt();
    reverse(a);
  }

  //Q5
    public static int sumOfDigits(int num) {
    int sum = 0;
    while (num > 0) {
        int lastDigit = num % 10;
        sum = sum + lastDigit;  
        num /= 10;        
      }
      return sum;
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.println("Sum of digits: " + sumOfDigits(n));
  }
}
//Practice Set
