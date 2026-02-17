import java.util.*;
public class JavaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    String input = sc.next();       //capture till space
    System.out.print(input);

    String name = sc.nextLine();       //capture spaces also
    System.out.print(name);

    int number = sc.nextInt();       //input for numbers
    System.out.print(number);
  } 
}
//Inputs in Java
  // next
  // nextLine
  // nextInt
  // nextLong
  // nextByte
  // nextFloat
  // nextDouble
  // nextBoolean
  // nextShort