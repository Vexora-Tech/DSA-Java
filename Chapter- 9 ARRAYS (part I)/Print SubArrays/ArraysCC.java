import java.util.*;

public class ArraysCC{
  public static void subArrays(int numbers[]){
    int total = 0;
    for(int i=0; i<numbers.length; i++){
      for(int j=i; j<numbers.length; j++){
        for(int k=i; k<=j; k++){    //print
          System.out.print(numbers[k] + " ");   //subArrays
        }
        total++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total subArrays : " + total);
  }
  public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10};
    subArrays(numbers);
  }


  //Home Work Problem - Calculating the sum of SubArrays
  public static void subArrays(int numbers[]){
    int total = 0;
    for(int i=0; i<numbers.length; i++){

      for(int j=i; j<numbers.length; j++){

        int sum = 0;
        for(int k=i; k<=j; k++){    //print
          System.out.print(numbers[k] + " ");   //subArrays
          sum += numbers[k];
        }
        total++;
        System.out.println("     → sum is : " + sum);
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total subArrays : " + total);
  }
  public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10};
    subArrays(numbers);
  }


  //Home Work Problem - Calculating smallest & largest sum
  public static void subArrays(int numbers[]){
    int largest = Integer.MIN_VALUE;  // -infinity
    int smallest = Integer.MAX_VALUE;  // +infinity
    int total = 0;
    for(int i=0; i<numbers.length; i++){

      for(int j=i; j<numbers.length; j++){

        int sum = 0;
        for(int k=i; k<=j; k++){    //print
          System.out.print(numbers[k] + " ");   //subArrays
          sum += numbers[k];
        }

        total++;
        System.out.println("     → sum is : " + sum);
        
        //largest
          if(sum > largest){
            largest = sum;
          }

          //smallest
          if(sum < smallest){
            smallest = sum;
          }

        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total subArrays : " + total);
    System.out.println("smallest sum in subArrays : " + smallest);
    System.out.println("largest sum in subArrays : " + largest);
  }
  public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10};
    subArrays(numbers);
  }  
}
//subArrays in Array

