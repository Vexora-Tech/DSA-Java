import java.util.*;

public class JavaBasics{
  public static void rot_pyramid(int n){
    //number of lines
    for(int i=1; i<=n; i++){
      //number of spaces 
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }  
      //number of stars
      for(int j=1; j<=i; j++){  
      System.out.print("*");
      }
      //adds next line
      System.out.println();
    } 
  }
  public static void main(String args[]){
    rot_pyramid(4);
  } 
}
//Inverted & Rotated half - Pyramid

