public class BitManipulation{
  public static void OddorEven(int n){
    int bitMask = 1;
    if((n & bitMask) == 0){
      //Even number
      System.out.println("number is Even");
    }else{
      //Odd number
      System.out.println("number is Odd");
    }

  }
  public static void main(String args[]){
    OddorEven(3);
    OddorEven(14);
    OddorEven(15);
    OddorEven(4);
  }
}
//Check if Odd or Even