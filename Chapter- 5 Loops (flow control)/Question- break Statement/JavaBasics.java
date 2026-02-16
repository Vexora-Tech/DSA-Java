import java.util.*;

public class JavaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("enter a number : ");
      int num = sc.nextInt();
      if(num % 10 == 0){
        break;
      }
      System.out.println("entered number is not divided by 10 : " + num);
    } while(true);
    System.out.println("entered number is divided by 10");

  } 
}

public class JavaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
  //from while Loop
   while(true){
    System.out.print("enter a number : ");
    int num = sc.nextInt();
    if(num % 10 == 0){
      break;
    }
    System.out.println("entered number is not divided by 10 : " + num);
  }
  System.out.println("entered number is divided by 10");
  }
}
//Question- break Statement


