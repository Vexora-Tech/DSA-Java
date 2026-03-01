import java.util.*;

public class Matrices {
  //HOMEWORK PROBLEM 
  public static void largest_Smallest(int matrix[][]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    int n = matrix.length, m = matrix[0].length;

    for(int i=0; i<n; i++) {
      for(int j= 0; j<m; j++) {
        //largest
        if(matrix[i][j] > largest){
          largest = matrix[i][j];
        }
        //smallest
        if(matrix[i][j] < smallest){
          smallest = matrix[i][j];
        }
      }
    }
    System.out.println("largest value is : " + largest);
    System.out.println("smallest value is : " + smallest);
  }
  
  public static boolean search(int matrix[][], int key){
    int n = matrix.length, m = matrix[0].length;

    for(int i=0; i<n; i++) {
      for(int j= 0; j<m; j++) {
        if(matrix[i][j] == key){
          System.out.println("found at : (" + i + "," + j + ")");
          return true;
        }
      }
    }
    System.out.println("not found");
    return false;
  }

  public static void main(String[] args) {
    int matrix[][] = new int[3][3];
    int n = matrix.length, m = matrix[0].length;

    Scanner sc = new Scanner(System.in);
    //input
    for(int i=0; i<n; i++) {
      for(int j= 0; j<m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    //output
    for(int i=0; i<n; i++) {
      for(int j= 0; j<m; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    search(matrix, 8);
    largest_Smallest(matrix);
  }
}
//Creation of 2D Arrays
