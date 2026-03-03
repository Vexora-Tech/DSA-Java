import java.util.*;

public class Matrices {
  //Q1
  public class Count7s {
    public static void main(String[] args) {
        int[][] array = { {4,7,8}, {8,8,7} };
        int count = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("Count of 7s: " + count);
    }
  }

  //Q2
  public class SecondRowSum {
    public static void main(String[] args) {
        int[][] nums = { {1,4,9}, {11,4,3}, {2,2,3} };
        int sum = 0;
        
        // Second row is at index 1
        for (int j = 0; j < nums[1].length; j++) {
            sum += nums[1][j];
        }
        System.out.println("Sum of second row: " + sum);
    }
  }


  //Q3
  public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = matrix.length;       // 2
        int cols = matrix[0].length;    // 3

        // Transposed matrix dimensions are flipped: cols x rows
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j]; // Swap row and column index
            }
        }

        // Print transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
  }
}
//Practice Set