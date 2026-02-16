import java.util.*;

public class JavaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a range : ");
    int range = sc.nextInt();
    int counter = 1;
    while(counter <= range){
      System.out.println(counter);
      counter++;
    }
    System.out.println("printed numbers from 1 to 10");
  } 
}
//Print number from 1 to n


