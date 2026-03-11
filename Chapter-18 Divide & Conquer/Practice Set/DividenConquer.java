//Q1
public class DivideAndConquer {
  // DIVIDE & CONQUER - Main merge sort method
  public static void mergeSort(String[] arr, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;

      // DIVIDE - Split into two halves
      mergeSort(arr, left, mid);
      mergeSort(arr, mid + 1, right);

      // COMBINE - Merge the sorted halves
      merge(arr, left, mid, right);
    }
  }

  // CONQUER - Merge two sorted halves
  public static void merge(String[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    // Temporary arrays
    String[] leftArr  = new String[n1];
    String[] rightArr = new String[n2];

    // Copy data to temp arrays
    for (int i = 0; i < n1; i++)
      leftArr[i] = arr[left + i];
    for (int j = 0; j < n2; j++)
      rightArr[j] = arr[mid + 1 + j];

    int i = 0, j = 0, k = left;

    // Compare strings lexicographically (all lowercase)
    while (i < n1 && j < n2) {
      if (leftArr[i].compareTo(rightArr[j]) <= 0) {
        arr[k] = leftArr[i];
        i++;
        } else {
          arr[k] = rightArr[j];
          j++;
        }
        k++;
        }

      // Copy remaining elements
      while (i < n1) arr[k++] = leftArr[i++];
      while (j < n2) arr[k++] = rightArr[j++];
    }

  public static void main(String[] args) {
    String[] arr = {"banana", "apple", "mango", "grape", "cherry", "fig", "date"};

    mergeSort(arr, 0, arr.length - 1);

    for (int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    } 
    System.out.println();
  }
}

//Q2
public class DivideAndConquer {

  // DIVIDE & CONQUER - Main method
  public static int majorityElement(int[] nums, int left, int right) {

    // BASE CASE - single element is always majority of itself
    if (left == right) {
      return nums[left];
    }

    // DIVIDE - Split into two halves
    int mid = (left + right) / 2;

    // CONQUER - Recursively find majority in each half
    int leftMajority  = majorityElement(nums, left, mid);
    int rightMajority = majorityElement(nums, mid + 1, right);

    // COMBINE - If both halves agree, that's the majority
    if (leftMajority == rightMajority) {
      return leftMajority;
    }

    // Otherwise, count both candidates in the full range & return the winner
    int leftCount  = countInRange(nums, leftMajority,  left, right);
    int rightCount = countInRange(nums, rightMajority, left, right);

    return leftCount > rightCount ? leftMajority : rightMajority;
  }

  // Helper - count occurrences of a number in a given range
  public static int countInRange(int[] nums, int target, int left, int right) {
    int count = 0;
    for (int i = left; i <= right; i++) {
      if (nums[i] == target) count++;
    }
    return count;
  }

  public static void main(String[] args) {

    int[] nums1 = {2, 2, 1, 1, 1, 1, 2, 2};
    System.out.println("Test 1 - Majority Element: "+ majorityElement(nums1, 0, nums1.length - 1));
  }
}


//Q3
public class DivideAndConquer {

  // DIVIDE & CONQUER - Main method
  public static long mergeSort(int[] arr, int left, int right) {
    long invCount = 0;

  if (left < right) {
    int mid = (left + right) / 2;

    // DIVIDE - Count inversions in left half
    invCount += mergeSort(arr, left, mid);

    // DIVIDE - Count inversions in right half
    invCount += mergeSort(arr, mid + 1, right);

    // COMBINE - Count split inversions & merge
    invCount += merge(arr, left, mid, right);
    }
    return invCount;
  }

  // CONQUER - Merge and count inversions
  public static long merge(int[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] leftArr  = new int[n1];
    int[] rightArr = new int[n2];

    // Copy data to temp arrays
    for (int i = 0; i < n1; i++) leftArr[i]  = arr[left + i];
    for (int j = 0; j < n2; j++) rightArr[j] = arr[mid + 1 + j];

    int i = 0, j = 0, k = left;
    long invCount = 0;

    while (i < n1 && j < n2) {
      if (leftArr[i] <= rightArr[j]) {
        // No inversion
        arr[k++] = leftArr[i++];
      } else {
        // ⚠️ KEY STEP: leftArr[i] > rightArr[j]
        // All remaining elements in leftArr are > rightArr[j]
        // So they ALL form inversions with rightArr[j]
        invCount += (n1 - i);
        arr[k++] = rightArr[j++];
      }
    }
      // Copy remaining elements
      while (i < n1) arr[k++] = leftArr[i++];
      while (j < n2) arr[k++] = rightArr[j++];

      return invCount;
    }

    // Helper - print array
    public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    }


  public static void main(String[] args) {

    int[] arr1 = {3, 2, 6, 4, 5};
    System.out.println("Array 1: ");
    printArray(arr1);
    System.out.println("Inversion Count: "+ mergeSort(arr1, 0, arr1.length - 1));
  }
}
//Practice Set