public class Complexity{
  public static void main(String args[]){
    //Time complexity measures how an algorithm's runtime grows as input size (n) increases, expressed in Big O notation.
    // Common Complexities with Java Examples

    // O(1) — Constant
    int getFirst(int[] arr) {
    return arr[0]; // always one step
    }

    //O(n) — Linear
    int findMax(int[] arr) {
    int max = arr[0];
    for (int x : arr) { // loops n times
        if (x > max) max = x;
    }
    return max;
    }

    //O(n²) — Quadratic
    boolean hasDuplicates(int[] arr) {
    for (int i = 0; i < arr.length; i++)
        for (int j = i + 1; j < arr.length; j++) // nested loop
            if (arr[i] == arr[j]) return true;
    return false;
    }

    //O(log n) — Logarithmic
    int binarySearch(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) low = mid + 1; // halves search space
        else high = mid - 1;
    }
    return -1;
    }

    //O(n log n) — Linearithmic — typical of efficient sorting like Arrays.sort() (uses dual-pivot quicksort internally).

    //Key Rules
      //Drop constants: O(2n) → O(n)
      //Drop lower terms: O(n² + n) → O(n²)
      //Nested loops usually multiply: O(n) × O(n) = O(n²)
  }
}