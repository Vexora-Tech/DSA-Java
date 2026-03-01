import java.util.*;

public class Matrices {
  public static void spiralMatrix(int matrix[][]) {
    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length - 1;
    int endCol = matrix[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {
      // Top: left to right
      for (int j = startCol; j <= endCol; j++) {
        System.out.print(matrix[startRow][j] + " ");
      }

      // Right: top to bottom
      for (int i = startRow + 1; i <= endRow; i++) {
        System.out.print(matrix[i][endCol] + " ");
      }

      // Bottom: right to left
      for (int j = endCol - 1; j >= startCol; j--) {
        System.out.print(matrix[endRow][j] + " ");
      }

      // Left: bottom to top
      for (int i = endRow - 1; i >= startRow + 1; i--) {
        System.out.print(matrix[i][startCol] + " ");
      }

      // Shrink the boundaries
      startRow++;
      endRow--;
      startCol++;
      endCol--;
    }
  }

  public static void main(String[] args) {
    int matrix[][] = {{1,  2,  3,  4},
                      {5,  6,  7,  8},
                      {9,  10, 11, 12},
                      {13, 14, 15, 16}};

    spiralMatrix(matrix);
  }
}
//Spiral Matrix