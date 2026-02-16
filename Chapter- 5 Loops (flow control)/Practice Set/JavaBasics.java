import java.util.*;

//Q1
public class JavaBasics{
  public static void main(String args[]){
    for(int i=1; i<5; i++){
    System.out.println("hello world!");
    i+=2;
    }
  } 
}
// two times


//Q2
public class JavaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num;
    int choice;
    int evensum = 0;
    int oddsum = 0;
    do {
      System.out.print("enter a number : ");
      num = sc.nextInt();

      if(num % 2 == 0){
        evensum += num;
      }else{
        oddsum += num;
      }
    System.out.println("do you want to continue? press 1 or 0 for no : ");
    choice = sc.nextInt();
    }while(choice == 1);
    System.out.println("sum of even number is : " + (evensum)); 
    System.out.println("sum of odd number is : " + (oddsum)); 
  } 
}


//Q3
public class JavaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num;
    int fact = 1;

    System.out.print("enter a number : ");
    num = sc.nextInt();

    for(int i=1; i<=num; i++){
      fact*= i;
    }
    System.out.print(fact);
  } 
}


//Q4
public class JavaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int num = sc.nextInt();

    for(int i=1; i<=10; i++){
    System.out.println(num + " x " + i + " = " + num*i);  
    }
  } 
}


//Q5
public class JavaBasics{
  public static void main(String args[]){

    for(int i=1; i<=5; i++){
      System.out.println("i = " + i);
    }
    System.out.println("i after loop = " + i);
  } 
}
//Scope of variable is referred to the part of the program where the variable can be used.

//Inthisprogramvariableiisdeclaredintheforloop.Soscopeofvariableiislimitedtotheforlooponlythatisbetween{and}oftheforloop.Thereisadisplaystatementaftertheforloopwhere variableiis used which meansiis used outof scope. This leads to compilation errors.

//Theprogramgivenwillnotrunandgiveanerrorinstead.Tocorrecttheprogram, the variableineeds to be declared outside the for loop.

//Practice Set


