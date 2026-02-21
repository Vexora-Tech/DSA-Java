import java.util.*;

public class ArraysCC{
  public static int linearSearch(int numbers[], int key){
    for(int i=0; i<numbers.length; i++){
      if(numbers[i] == key){
        return i;
      }
    }
    return -1;
  }
  public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
    int key = 10;

    int index = linearSearch(numbers, key);
    if(index == -1){
      System.out.println("index not found");
    }else{
      System.out.println("index is : " + index);
    }
  }

  //Home Work Problem
  public static int linearSearch(String menu[], String key){
    for(int i=0; i<menu.length; i++){
      if(menu[i] == key){
        return i;
      }
    }
    return -1;
  }
  public static void main(String args[]){
    String menu[] = {"pizza", "momos", "samosa", "fries"};
    String key = "momos";

    int index = linearSearch(menu, key);
    if(index == -1){
      System.out.println("index not found");
    }else{
      System.out.println("index is : " + index);
    }
  }
}
//Linear Search

