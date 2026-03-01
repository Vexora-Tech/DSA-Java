import java.util.*;

public class Matrices {
  public static int diagonalSum(int matrix[][]){
    int sum = 0;
    int n = matrix.length, m = matrix[0].length;

    // O(n^2)
    for(int i=0; i<n; i++) {
      for(int j= 0; j<m; j++) {
        if(i == j){
          sum += matrix[i][j];
        }
        else if(i+j == n-1){
          sum += matrix[i][j];
        }
      }
    }

    // O(n)
    for(int i=0; i<n; i++) {
      //pd
      sum += matrix[i][i];

      //sd
      if(i != n-i-1){
        sum += matrix[i][n-i-1];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int matrix[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};

  System.out.println(diagonalSum(matrix));
  }
}
//Diagonal Sum
