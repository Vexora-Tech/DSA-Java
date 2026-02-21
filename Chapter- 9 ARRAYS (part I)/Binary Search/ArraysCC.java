import java.util.*;

public class ArraysCC{
  public static int Index(int numbers[], int key){
    int start = 0 , end = numbers.length-1;
    while(start <= end){
      int mid = (start + end)/2;

      if(numbers[mid] == key){
        return mid;
      }
      if(numbers[mid] < key){   //right
        start = mid + 1;
      }else{  //left
        end = end - 1;
      }
    }
    return -1;
  }
  public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
    int key = 10;

    System.out.println("index is : " + Index(numbers, key));
  }
}
//Binary Search

