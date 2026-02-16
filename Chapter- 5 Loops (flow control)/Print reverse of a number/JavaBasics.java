import java.util.*;

public class JavaBasics{
  public static void main(String args[]){
    int number = 2004;
    while(number > 0){
      int lastdigit = number % 10;
      System.out.print(lastdigit);
      number/=10;
    }
  } 
}
//Print reverse of a number


