import java.util.*;

public class ArraysCC{
  public static void main(String args[]){
    int marks[] = new int[3];

    Scanner sc = new Scanner(System.in);

    System.out.println("Length of array is : " + marks.length);

    System.out.print("Enter phy marks : ");
    marks[0] = sc.nextInt();  //phy
    System.out.print("Enter chem marks : ");
    marks[1] = sc.nextInt();  //chem
    System.out.print("Enter math marks : ");
    marks[2] = sc.nextInt();  //math

    System.out.println("Phy : " + marks[0]);
    System.out.println("Chem : " + marks[1]);
    System.out.println("Math : " + marks[2]);

    marks[2] = 100;  //we can do "+", "-", "*", "/"
    // System.out.println("Updated Math : " + marks[2]);

    int percentage = (marks[0] + marks[1] + marks[2]) / 3;
    System.out.println("percentage is : " + percentage + "%");
  }
}
//Arrays - input, output & update

