import java.util.*;

public class JavaBasics{
  public static void swap(int a, int b){   
    //swap
    int temp = a;
    a = b;
    b = temp;

    System.out.println("a is : " + a);
    System.out.println("b is : " + b);
  }
  public static void main(String args[]){
    //swap - value exchange
    int a = 5;
    int b = 10;
    swap(a, b);  
  } 
}
//Call by value (in Java)

//java functions always works on call by value

