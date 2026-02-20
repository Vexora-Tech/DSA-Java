import java.util.*;

public class JavaBasics{
  public static void Hollow_rhombus(int n){
    //outer
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print("  ");
      }
      for(int j=1; j<=n; j++){  
      if(i == 1 || i == n || j == 1 || j == n){
          //boundary cells
          System.out.print("* ");
        }else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }  
  }
  public static void main(String args[]){
    Hollow_rhombus(5);
  } 
}
//Butterfly Pattern

