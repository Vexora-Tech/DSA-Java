public class RecursionBasics{
  //Q1
  public static void Occurred(int arr[], int key, int i) {
    if (i == arr.length){
      return;
    }
    if(arr[i] == key){
      System.out.print(i + " ");
    }
    Occurred(arr, key, i+1);
  }  
  public static void main(String args[]){
    int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
    Occurred(arr, 2, 0);
    System.out.println();
  }


  //Q2
  static String digits[] = {
    "zero", "one", "two", "three", "four",
    "five", "six", "seven", "eight", "nine"
  };
  public static void printDigits(int number) {
    // Base Case: if number becomes 0, stop
    if (number == 0) {
      return;
    }
    int lastDigit = number % 10;                  // Extract last digit
    printDigits(number / 10);                     // Recurse on remaining digits
    System.out.print(digits[lastDigit] + " ");    // Print after recursion
  }

  public static void main(String[] args) {
    printDigits(1234);
    System.out.println();
  }


  //Q3
  public static int findLength(String str) {
    if (str.length() == 0) {
      return 0;
    }
    return findLength(str.substring(1)) + 1;
  }

  public static void main(String[] args) {
    String str = "hello";
    System.out.print(findLength(str));
  }


  //Q4
  public static int countSubstrs(String str, int i, int j, int n){
    if(n == 1){
      return 1;
    }

    if(n <= 0){
      return 0;
    }

    int res = countSubstrs(str, i+1, j, n-1) + countSubstrs(str, i, j-1, n-1) - countSubstrs(str, i+1, j-1, n-2);

    if(str.charAt(i) == str.charAt(j)){
      res++;
    }

    return res;
  }

  public static void main(String[] args) {
    String str = "abcab";
    int n = str.length();
    System.out.print(countSubstrs(str, 0, n-1, n));
  }


  //Q5
  public static void towerOfHanoi(int n, String src, String helper, String dest) {
  if (n == 1) {
    System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
    return;
  }

  // Step 1: Transfer top (n-1) disks from src to helper using dest as helper
  towerOfHanoi(n - 1, src, dest, helper);

  // Step 2: Transfer nth (largest) disk from src to dest
  System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

  // Step 3: Transfer (n-1) disks from helper to dest using src as helper
  towerOfHanoi(n - 1, helper, src, dest);
}

  public static void main(String[] args) {
    int n = 3;
    System.out.println("Tower of Hanoi with " + n + " disks:\n");
    towerOfHanoi(n, "A", "B", "C");
  }
}
//Practice Set