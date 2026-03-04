import java.util.*;

public class Strings{
  public static void main(String args[]){
    String s1 = "Tony";
    String s2 = "Tony";
    String s3 = new String("Tony");
    
    //s1 & s2 point to the same tony in the memory but with 'new' keyword it creates a new tony in the memory.
    //equal
    if(s1 == s2){
      System.out.println("Strings are Equal");
    }else{
      System.out.println("Strings are not Equal");
    }

    //not equal
    if(s2 == s3){
      System.out.println("Strings are Equal");
    }else{
      System.out.println("Strings are not Equal");
    }

    //equal because it checks value only
    if(s2.equals(s3)){
      System.out.println("Strings are Equal");
    }else{
      System.out.println("Strings are not Equal");
    }
  }
}
//String Functions - compare