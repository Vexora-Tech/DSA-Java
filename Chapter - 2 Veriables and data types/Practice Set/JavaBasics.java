import java.util.*;

// Q1.
// average of three numbers
public class JavaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int avg = (a + b + c) / 3;

    System.out.println("the average of three numbers is: "+ avg);
  } 
}


// Q2.
// area of a square
public class JavaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int side = sc.nextInt();

    int area = side * side;

    System.out.println("the area of square is: "+ area);
  } 
}


// Q3.
// bill of items
public class JavaBasics{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    float pen = sc.nextFloat();
    float pencil = sc.nextFloat();
    float eraser = sc.nextFloat();

    float total = pencil + pen + eraser;

    System.out.println("bill is: "+ total);

    // with 18% tax
    float newTotal = total + (0.18f * total);
    System.out.println("bill with tax is: "+ newTotal);
  } 
}

{
// Q4.
// In the mentioned code, the result variable will be of double type because oftype conversion.
}


{
// Q5.
// No, the statement will not give any error.NamesofvariablesarecalledidentifiersinJava.Identifierrulesays,identifierscanstartwithany alphabet or underscore (“_”) or dollar (“$”).According to the rule the given variable name is a valid identifier.
}
//Practice set