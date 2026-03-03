import java.util.*;

public class Strings{
  public static boolean isPalindrome(String str){
    for(int i=0; i<str.length()/2; i++){
      if(str.charAt(i) != str.charAt(str.length()-1-i)){
        return false;
      }
    }
    return true;
  }
  public static void main(String args[]){
    String str = "racecar";
    System.out.print(isPalindrome(str));
  }
}
//Check if String is Palindrome