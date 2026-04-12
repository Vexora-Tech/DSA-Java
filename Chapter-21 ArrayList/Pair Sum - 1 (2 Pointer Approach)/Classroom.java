import java.util.*;
public class Classroom{
  public static boolean pairSum1(ArrayList<Integer> list, int target){
    int lp = 0;
    int rp = list.size()-1;
    //2 Pointer Appoach 
    while(lp != rp){
      //Case 1
      if(list.get(lp) + list.get(rp) == target){
        return true;
      }

      //Case 2
      if(list.get(lp) + list.get(rp) < target){
        lp++;
      }else{
        //Case 3
        rp--;
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
//Pair Sum - 1 (2 Pointer Approach)
