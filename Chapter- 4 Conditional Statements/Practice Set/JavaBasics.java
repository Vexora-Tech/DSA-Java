import java.util.*;

// //Q1.Positive ot Negative Number
// public class JavaBasics{
//   public static void main(String args[]){
     
//     Scanner sc = new Scanner(System.in);
//     int number = sc.nextInt();
//     String type = number >= 0 ? "positive" : "negative";
//     System.out.println(type);
//   } 
// }


// //Q2. Fever or Not 
// public class JavaBasics{
//   public static void main(String args[]){    
//     double temp = 90.5;
//     if(temp > 100){
//       System.out.println("you have a Fever");
//     }else{
//       System.out.println("you don't have a Fever");
//     }
//   } 
// }


// //Q3. Week Days
// public class JavaBasics{
//   public static void main(String args[]){    
//     Scanner sc = new Scanner(System.in);
//     int week = sc.nextInt();
//     switch(week){
//       case 1 : System.out.println("monday");
//       break;
//       case 2 : System.out.println("tuesday");
//       break;
//       case 3 : System.out.println("wednesday");
//       break;
//       case 4 : System.out.println("thursday");
//       break;
//       case 5 : System.out.println("friday");
//       break;
//       case 6 : System.out.println("saturday");
//       break;
//       case 7 : System.out.println("sunday");
//       break;
//       default : System.out.println("");
//     }
//   } 
// }


// //Q4. value of x & y
// public class JavaBasics{
//   public static void main(String args[]){    
//     int a = 63, b = 36;

//     boolean x = (a < b) ? true : false;

//     int y = (a > b) ? a : b;
//   } 
// }
// // Value of x = false & y = 63.


//Q5. leap year or not
public class JavaBasics{
  public static void main(String args[]){ 
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = scanner.nextInt();
    boolean isLeapYear = false;
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
            isLeapYear = true;
            }
            } else {
                isLeapYear = true;
            }
    }       
    if (isLeapYear) {
    System.out.println(year + " is a leap year.");
    } else {
    System.out.println(year + " is not a leap year.");
    };
  }
}

//Practice Set
