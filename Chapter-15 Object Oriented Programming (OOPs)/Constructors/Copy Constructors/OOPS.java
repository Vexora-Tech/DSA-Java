public class OOPS{
  public static void main(String args[]){
    Student s1 = new Student();
    s1.name = "vansh";
    s1.roll = 123;
    s1.password = "abcde";
    s1.marks[0] = 100;
    s1.marks[1] = 90;
    s1.marks[2] = 80;


    Student s2 = new Student(s1);   //copy
    s2.password = "xyz";
  //copy constructor generally make a shallow copy.
  //so the marks we changed for s1, it will also change for s2.
    s1.marks[2] = 100;

    for(int i=0; i<3; i++){
      System.out.println(s2.marks[i]);
    }
  }
}

class Student {
  String name;
  int roll;
  String password;
  int marks[];

  //Copy Constructor
  Student(Student s1){
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;
  }

  Student(){
    marks = new int[3];
    System.out.println("Constructor is called..");
  }

  Student(String name){
    marks = new int[3];
    this.name = name;
  }
}
//Copy Constructors
