import java.util.*;

public class JavaBasics{
  public static void Hollow_rectangle(int row, int col){
    //outer for rows
    for(int i=1; i<=row; i++){
      //inner for cols
      for(int j=1; j<=col; j++){
        //cell - (i,j)
        if(i == 1 || i == row || j == 1 || j == col){
          //boundary cells
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    } 
  }
  public static void main(String args[]){
    Hollow_rectangle(4,5);
  } 
}
//Hollow Rectangle Pattern

