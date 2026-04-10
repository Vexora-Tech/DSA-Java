import java.util.*;
public class Classroom{
  public static boolean pairSum1(ArrayList<Integer> list, int target){
    int maxWater = 0;
    int lp = 0;
    int rp = list.size()-1;
    //brute force method 
    for(int i=0; i<list.size(); i++){
      for(int j=i+1; j<list.size(); j++){
        if(list.get(i) + list.get(j) == target){
          return true;
        }
      }
    }
    return false;
  }
  public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    
    int target = 5;

    System.out.println(pairSum1(list, target));
  }
}
//Pair Sum - 1 (Brute Force)
