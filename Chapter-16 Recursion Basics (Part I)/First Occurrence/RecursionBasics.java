public class RecursionBasics{
  public static int firstOccur(int arr[], int key, int i) {
    if (i == arr.length){
      return -1;
    }
    if(arr[i] == key){
      return i;
    }
    return firstOccur(arr, key, i+1);
  }  
  public static void main(String args[]){
    int arr[] = {10, 7, 3, 9, 5, 8, 4, 5};
    System.out.print(firstOccur(arr, 5, 0));
  }
}
//First Occurrence