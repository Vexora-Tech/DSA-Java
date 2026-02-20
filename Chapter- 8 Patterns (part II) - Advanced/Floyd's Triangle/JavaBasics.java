import java.util.*;

public class JavaBasics{
  public static void floyds_triangle(int n){
    //outer
    int counter = 1;
    for(int i=1; i<=n; i++){
      //how many times counter will be printed
      for(int j=1; j<=i; j++){
        System.out.print(counter + " ");
        counter++;
      }
      System.out.println();
    } 
  }
  public static void main(String args[]){
    floyds_triangle(5);
  } 
}
//Floyd's Triangle

