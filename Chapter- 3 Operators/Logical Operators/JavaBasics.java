import java.util.*;

public class JavaBasics{
  public static void main(String args[]){
    // '&&'       
    System.out.println( (3 < 4) && (5 < 6) );       //T
    System.out.println( (3 > 4) && (5 < 6) );       //F
    System.out.println( (3 < 4) && (5 > 6) );       //F
    System.out.println( (3 > 4) && (5 > 6) );       //F


    // '||'       
    System.out.println( (3 < 4) || (5 < 6) );       //T
    System.out.println( (3 > 4) || (5 < 6) );       //T
    System.out.println( (3 < 4) || (5 > 6) );       //T
    System.out.println( (3 > 4) || (5 > 6) );       //F


    // '!'       
    System.out.println( !(3 < 4));       //F
    System.out.println( !(3 > 4));       //T
  } 
}
//Logical Operators
// '&&'
// '||'
// '!'