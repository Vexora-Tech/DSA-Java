import java.util.*;

public class ArraysCC{
public static void prefixForce(int numbers[]){
    int maxSum = Integer.MIN_VALUE;  // -infinity
    int prefix[] = new int[numbers.length];

    prefix[0] = numbers[0];
    //calculate prefix Array
    for(int i=1; i<prefix.length; i++){
      prefix[i] = prefix[i-1] + numbers[i];
    }

    //start
    for(int i=0; i<numbers.length; i++){
      //end
      for(int j=i; j<numbers.length; j++){

        int currSum = 0; 
      
        currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

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
    prefixForce(numbers);
  }
}
//Max subArray sum - II (prefix force)

