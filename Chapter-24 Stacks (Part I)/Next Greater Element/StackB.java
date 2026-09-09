import java.util.*;
public class StackB{ 
  public static void main(String args[]){
    int arr[] = {6, 8, 0, 1, 3};
    Stack<Integer> s = new Stack<>();
    int nxtGreater[] = new int[arr.length];

    for(int i=arr.length-1; i>=0; i--){
      //Step 1 - while
      while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
        s.pop();
      }

      //Step 2 - if-else
      if(s.isEmpty()){
        nxtGreater[i] = -1;
      }else{
        nxtGreater[i] = arr[s.peek()];
      }

      //Step 3 - Push in s
      s.push(i);
    }

    for(int i=0; i<nxtGreater.length; i++){
      System.out.print(nxtGreater[i]+" ");
    }
    System.out.println();

    //next greater right - done
    //next greater left - change the 'for loop' start with 0 to n - for(int i=0; i=arr.length-1; i++). 
    //next smaller right - change the while loop condition - while(!s.isEmpty() && arr[s.peek()] >= arr[i]). 
    //next smaller left - chnge the for loop starts with 0 to n and while loop also - while(!s.isEmpty() && arr[s.peek()] >= arr[i]). 
  }
}

//Next Greater Element