import java.util.*;

public class ArraysCC{
public static void bruteForce(int numbers[]){
    int maxSum = Integer.MIN_VALUE;  // -infinity
    //start
    for(int i=0; i<numbers.length; i++){
      //end
      for(int j=i; j<numbers.length; j++){

        int currSum = 0;
        //subArrays
        for(int k=i; k<=j; k++){    
          //sum of subArrays
          currSum += numbers[k];
        }
        System.out.println("→ sum is : " + currSum);
        
        //maxSum
          if(currSum > maxSum){
            maxSum = currSum;
          }
      }
    }
    System.out.println("max sum in subArray : " + maxSum);
  }
  public static void main(String args[]){
    int numbers[] = {1, -2, 6, -1, 3};
    bruteForce(numbers);
  }
}
//Max subArray sum - I (brute force)

