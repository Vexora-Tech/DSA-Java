public class RecursionBasics{
  public static int friendsPair(int n) {
    //base case
    if (n == 1 || n == 2){
      return n;
    }
    //choice
    // int fnm1 = friendsPair(n-1);

    //pair
    // int fnm2 = friendsPair(n-2);
    // int pairWays = (n-1) * fnm2;
    
    // int totalWays = fnm1 + pairWays;
    // return totalWays;

    return friendsPair(n-1) + (n-1) * friendsPair(n-2);
  }
  public static void main(String args[]){
    System.out.print(friendsPair(3));
  }
}
//Friends pairing problem