public class OOPS{
  public static void main(String args[]){
    Student s1 = new Student();
    Student s2 = new Student("vansh");
    // Student s3 = new Student("ram", 123);   
  }
}

class Student {
  String name;
  int roll;
  
  //Non-Parameterized Constructor 
  Student(){    // Called for s1.
    System.out.println("Constructor is called..");
  }

  //Parameterized Constructor
  Student(String name){   // Called for s2.
    this.name = name;
  }
}
//Types of Constructors
