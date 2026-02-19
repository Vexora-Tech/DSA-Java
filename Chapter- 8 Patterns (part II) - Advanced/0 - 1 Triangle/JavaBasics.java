import java.util.*;

public class JavaBasics{
  public static void triangle01(int n){
    //outer
    int counter = 1;
    for(int i=1; i<=n; i++){
      //how many times counter will be printed
      for(int j=1; j<=i; j++){
        if((i+j) % 2 == 0){
        System.out.print("1");
        }else{
        System.out.print("0");
        }
        counter++;
      }
      System.out.println();
    } 
  }
  public static void main(String args[]){
    triangle01(5);
  } 
}
//0 - 1 Triangle

