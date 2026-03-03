import java.util.*;

public class Strings {
  //Q1
  public static int countVowels(String str) {
    int count = 0;
    String vowels = "aeiou";

    for (int i = 0; i < str.length(); i++) {
      if (vowels.indexOf(str.charAt(i)) != -1) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = sc.nextLine();

      System.out.println("Lowercase vowel count: " + countVowels(str));
  }


  //Q2
  //false true


  //Q3
  //ApnaCoege


  //Q4
  public static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length()){
      return false;
    }

    char[] arr1 = str1.toLowerCase().toCharArray();
    char[] arr2 = str2.toLowerCase().toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    return Arrays.equals(arr1, arr2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first string: ");
    String str1 = sc.nextLine();

    System.out.print("Enter second string: ");
    String str2 = sc.nextLine();

    if (isAnagram(str1, str2)) {
        System.out.println(str1 + " and " + str2 + " are anagrams!");
    } else {
      System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
    }
  }
}


//Q5 
 
//Practice Set