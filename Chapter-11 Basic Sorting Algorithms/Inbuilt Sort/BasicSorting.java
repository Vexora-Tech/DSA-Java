import java.util.*;

public class BasicSorting{
  public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
  
  public static void main(String args[]){
    int arr[] = {4, 2, 0, 6, 3, 2, 5};
    Arrays.sort(arr);
    Arrays.sort(arr, 0, 3);
    printArr(arr);
  }

  public static void printArr(Integer arr[]){ //takes object Integer
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String args[]){
    Integer arr[] = {4, 2, 0, 6, 3, 2, 5};
    Arrays.sort(arr, Collections.reverseOrder());
    Arrays.sort(arr, 0, 3, Collections.reverseOrder());
    printArr(arr);
  }
}
//Inbuilt Sort