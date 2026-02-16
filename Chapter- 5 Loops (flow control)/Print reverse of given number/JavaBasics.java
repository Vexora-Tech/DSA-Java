import java.util.*;

public class JavaBasics{
  public static void main(String args[]){
    int number = 2004;
    int rev = 0;
    while(number > 0){
      int lastdigit = number % 10;
      rev = (rev * 10) + lastdigit;
      number/=10;
    }
    System.out.print(rev);
  } 
}
//Print reverse of given number


