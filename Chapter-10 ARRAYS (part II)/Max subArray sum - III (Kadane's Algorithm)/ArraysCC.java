import java.util.*;

public class ArraysCC{
public static void kadanes(int numbers[]){
    int maxSum = Integer.MIN_VALUE;  // -infinity
    int currSum = 0;

    for(int i=0; i<numbers.length; i++){
      currSum = currSum + numbers[i];
      if(currSum < 0){
        currSum = 0;
      }
      //maxSum
      maxSum = Math.max(currSum, maxSum);
    }
    System.out.println("max sum in subArrays : " + maxSum);
  }
  public static void main(String args[]){
    int numbers[] = {1, -2, 6, -1, 3};
    kadanes(numbers);
  }
}
//Max subArray sum - III (Kadane's Algorithm)


