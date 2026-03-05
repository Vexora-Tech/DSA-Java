public class BitManipulation{
  //Q1
  //The value of x^x = 0.
  //Thinkaboutit,xorgives0whenthebitsarethesame.Ifwecomparethesamenumbertoitself, the bits will always be the same. 
  //So, the answer of x^x will always be 0.

  //Q2
  //The idea is to use XOR operators toswap two numbers by their propertyx ^ x = 0
  public static void main(String args[]){
    int x = 3, y = 4;
    System.out.println("before swap : x = " + x + " and y = " + y);
    //swap XOR
    x = x ^ y;
    y = x ^ y;
    x = x ^ y;
    System.out.println("after swap : x = " + x + " and y = " + y);
  }

  //Q3
  //Theexpression-~xwilladd1toanintegerx.Weknowthattogetnegativeofanumber,invertitsbitsandadd1toit(Remembernegativenumbersarestoredin2’scomplement form), i.e.,
  //-x = ~x + 1;
  //-~x = x + 1 (by replacing x by ~x)
  public static void main(String args[]){
    int x = 6;
    System.out.println( x + " + " + 1 + " is " + -~x);
    x = -4;
    System.out.println( x + " + " + 1 + " is " + -~x);
    x = 0;
    System.out.println( x + " + " + 1 + " is " + -~x);
  }

  //Q4
  public static void main(String args[]){
    //convert uppercase letter to lowercase
    for(char ch='A'; ch<='Z'; ch++){
      System.out.print((char)(ch | ' '));
    }
    System.out.println();
  }
}
//Practice Set