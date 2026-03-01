import java.util.*;

public class Matrices {
  public static boolean staircaseSearch(int matrix[][], int key){     //O(n+m)
    int row = 0, col = matrix[0].length-1;

    while (row < matrix.length && col >= 0) {
      if(matrix[row][col] == key){
        System.out.println("fount at : (" + row + "," + col + ")");
        return true;
      }
      else if(key < matrix[row][col]){
        col--;
      }
      else{
        row++;
      }
    }
    System.out.println("key not found");
    return false;
  }


  //HOMEWORK PROBLEM
  public static boolean staircaseSearch(int matrix[][], int key) {   // O(n+m)
    int row = matrix.length - 1, col = 0; // Start from bottom-left

    while (row >= 0 && col < matrix[0].length) {
      if (matrix[row][col] == key) {
        System.out.println("found at: (" + row + "," + col + ")");
        return true;
      } else if (key < matrix[row][col]) {
        row--;  // Move up
      } else {
        col++;  // Move right
      }
    }
    System.out.println("key not found");
    return false;
  }

  public static void main(String[] args) {
    int matrix[][] = {{10, 20, 30, 40},
                      {15, 25, 35, 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}};

    int key = 33;
    staircaseSearch(matrix, key);
  }
}
//Search in Sorted Arrays (Staircase Search)