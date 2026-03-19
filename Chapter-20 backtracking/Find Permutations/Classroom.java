public class Classroom{
  public static void findPermutation(String str, String ans){
    if(str.length() == 0){
      System.out.println(ans);
      return;
    }

    for(int i=0; i<str.length(); i++){
      char curr = str.charAt(i);
      //abcde => "ab" + "de" = "abde"
      String Newstr = str.substring(0, i) + str.substring(i+1);
      findPermutation(Newstr, ans+curr);
    }
  }

  public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]){
    String str = "abc";
    findPermutation(str, "");
  }
}
//Find Permutations