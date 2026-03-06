public class OOPS{
  public static void main(String args[]){
    Student s1 = new Student();
    s1.name = "vansh";
    s1.roll = 123;
  }
}

class Student {
  String name;
  int roll;
}
//Destructors

//Java Usually don't have a destructor, Java have a "Garbage Collector" which automatically free up the space
