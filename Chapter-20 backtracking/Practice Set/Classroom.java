//Q1
public class Classroom {
  public static void printSolution(int sol[][]) {
    for (int i = 0; i < sol.length; i++) {
      for (int j = 0; j < sol.length; j++) {
        System.out.print(" " + sol[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static boolean isSafe(int maze[][], int x, int y) {
    // if (x, y) is outside maze, return false
    return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
  }

  public static boolean solveMaze(int maze[][]) {
    int N = maze.length;
    int sol[][] = new int[N][N];

    if (!solveMazeUtil(maze, 0, 0, sol)) {
      System.out.println("Solution doesn't exist");
      return false;
    }

    printSolution(sol);
    return true;
  }

  public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
    // Base case: reached destination
    if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
      sol[x][y] = 1;
      return true;
    }

    // Check if maze[x][y] is valid
    if (isSafe(maze, x, y)) {
      // Avoid revisiting
      if (sol[x][y] == 1) return false;

      sol[x][y] = 1;

      // Move right
      if (solveMazeUtil(maze, x + 1, y, sol)) return true;

      // Move down
      if (solveMazeUtil(maze, x, y + 1, sol)) return true;

      // Backtrack
      sol[x][y] = 0;
      return false;
    }
    return false;
  }

  public static void main(String[] args) {
    int maze[][] = {
      {1, 0, 0, 0},
      {1, 1, 0, 1},
      {0, 1, 0, 0},
      {1, 1, 1, 1}
    };

    solveMaze(maze);
  }
}


//Q2
public class Classroom {
  final static char[][] L = {
      {},                          // 0 - no letters
      {},                          // 1 - no letters
      {'a', 'b', 'c'},             // 2
      {'d', 'e', 'f'},             // 3
      {'g', 'h', 'i'},             // 4
      {'j', 'k', 'l'},             // 5
      {'m', 'n', 'o'},             // 6
      {'p', 'q', 'r', 's'},        // 7
      {'t', 'u', 'v'},             // 8
      {'w', 'x', 'y', 'z'}         // 9
  };

  public static void letterCombinations(String D) {
    int len = D.length();
    if (len == 0) {
      System.out.println("");
        return;
    }
    bfs(0, len, new StringBuilder(), D);
  }

  public static void bfs(int pos, int len, StringBuilder sb, String D) {
    if (pos == len) {
      System.out.println(sb.toString());
    } else {
      char[] letters = L[Character.getNumericValue(D.charAt(pos))];
      for (int i = 0; i < letters.length; i++) {
        bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), D);
      }
    }
  }

  public static void main(String[] args) {
    letterCombinations("2");   // single digit
    System.out.println("---");
    letterCombinations("23");  // two digits
  }
}


//Q3
public class Classroom {
  static int N = 8;

  public static boolean isSafe(int x, int y, int sol[][]) {
    return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);  // -1 means unvisited
  }

  public static void printSolution(int sol[][]) {
      for (int x = 0; x < N; x++) {
          for (int y = 0; y < N; y++)
              System.out.printf("%3d ", sol[x][y]);
          System.out.println();
      }
  }

  public static boolean solveKT() {
    int sol[][] = new int[N][N];

    // Initialize all cells as unvisited
    for (int x = 0; x < N; x++)
      for (int y = 0; y < N; y++)
        sol[x][y] = -1;

    // All 8 possible moves of a knight
    int xMove[] = { 2,  1, -1, -2, -2, -1,  1,  2 };
    int yMove[] = { 1,  2,  2,  1, -1, -2, -2, -1 };

    // Knight starts from (0, 0), move number 0
    sol[0][0] = 0;

    if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
      System.out.println("Solution does not exist");
        return false;
    } else {
      printSolution(sol);
    }
    return true;
  }

  public static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) {
    int next_x, next_y;

    // Base case: all cells visited
    if (movei == N * N)
      return true;

    // Try all 8 moves of the knight
    for (int k = 0; k < 8; k++) {
      next_x = x + xMove[k];
      next_y = y + yMove[k];

      if (isSafe(next_x, next_y, sol)) {
        sol[next_x][next_y] = movei;

          if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove))
            return true;
          else
            sol[next_x][next_y] = -1;  // Backtrack
      }
    }
    return false;
  }

  public static void main(String[] args) {
    solveKT();
  }
}
//Practice Set