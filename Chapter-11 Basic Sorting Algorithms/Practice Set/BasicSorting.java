import java.util.*;

public class BasicSorting{
  //bubble Sort
  public static void bubbleSort(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      for (int j=0; j<arr.length-i-1; j++) {
        if (arr[j] < arr[j+1]) {   // < for descending
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }


  //Selection Sort
  public static void selectionSort(int arr[]){
    for(int i=0; i<arr.length-1; i++){
      int maxPos = i;     // find MAX instead of min
      for(int j=i+1; j<arr.length; j++){
        if(arr[j] > arr[maxPos]){   // > for descending
          maxPos = j;
        }
      }
      // swap max to current position
      int temp = arr[maxPos];
      arr[maxPos] = arr[i];
      arr[i] = temp;
    }
  }


  // Insertion Sort
  public static void insertionSort(int arr[]){
    for(int i=0; i<arr.length; i++){
      int key = arr[i];
      int j = i-1;
      // shift elements smaller than key to the right
      while(j>=0 && arr[j] < key){    // < for descending
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = key;
    }
  }


  //Counting Sort
  public static void countingSort(int arr[]){
    // find max value
    int max = arr[0];
    for(int i=1; i<arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    // count frequency of each element
    int count[] = new int[max+1];
    for(int i=0; i<arr.length; i++){
      count[arr[i]]++;
    }
    // fill array in DESCENDING order (max → 0)
    int idx = 0;
    for(int i=max; i>=0; i--){
        while(count[i] > 0){
          arr[idx++] = i;
          count[i]--;
        }
    }
  }

  //to print every Array
  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String args[]){
    int arr[] = {4, 2, 3, 6, 5, 7, 9, 1};
    // bubbleSort(arr);
    // selectionSort(arr);
    // insertionSort(arr);
    countingSort(arr);
    printArr(arr);

  }
}
//Practice Set