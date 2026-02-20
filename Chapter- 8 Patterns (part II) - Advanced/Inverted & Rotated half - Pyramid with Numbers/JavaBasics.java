import java.util.*;

public class JavaBasics{
  public static void rot_pyramid_nums(int n){
    //number of lines
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i+1; j++){
        System.out.print(j);
      }
      System.out.println();
    } 
  }
  public static void main(String args[]){
    rot_pyramid_nums(5);
  } 
}
//Inverted & Rotated half - Pyramid with Numbers

