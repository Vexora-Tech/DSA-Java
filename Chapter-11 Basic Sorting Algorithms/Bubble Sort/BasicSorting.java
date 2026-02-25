import java.util.*;

public class BasicSorting {
  public static void BubbleSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int swap = 0;                          // reset each pass
        for (int j = 0; j < arr.length - 1 - i; j++) {
          if (arr[j] > arr[j + 1]) {         // > for ascending order
            // swap
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            swap++;
          }
        }
        System.out.println("Pass " + (i+1) + " swaps: " + swap);
        if (swap == 0){
          break;                      // early exit if already sorted
        }                             
    }
  }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

  public static void main(String args[]) {
    int arr[] = {4, 2, 0, 6, 3, 2, 5};
    BubbleSort(arr);
    printArr(arr);
  }
}
//Bubble Sort