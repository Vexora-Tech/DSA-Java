import java.util.*;

public class ArraysCC{
  public static void pair(int numbers[]){
    int total = 0;
    for(int i=0; i<numbers.length; i++){
      int curr = numbers[i];  //2, 4, 6, 8, 10

      //printing pairs
      for(int j=i+1; j<numbers.length; j++){
        System.out.print("(" + curr + "," + numbers[j] + ")");
        total++;
      }
      System.out.println();
    }
    System.out.println("total Pairs : " + total);
  }
  public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10};
    pair(numbers);
  }
}
//Pairs in Array

