import java.util.*;

public class ArraysCC{
  public static int values(int numbers[]){
    int largest = Integer.MIN_VALUE;  // -infinity
    int smallest = Integer.MAX_VALUE;  // +infinity
    for(int i=0; i<numbers.length; i++){
      //largest
      if(largest < numbers[i]){
        largest = numbers[i];
      }

      //smallest
      if(smallest > numbers[i]){
        smallest = numbers[i];
      }
    }
    //print smallest
    System.out.println("smallest in array is : " + smallest);

    //print largest
    System.out.println("largest in array is : " + largest);
    return 0;
  }
  public static void main(String args[]){
    int numbers[] = {2, 4, 6, 18, 10, 12, 14, 16};

    values(numbers);
  }
}
//Largest in Array

