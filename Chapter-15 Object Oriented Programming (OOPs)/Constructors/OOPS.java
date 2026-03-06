public class OOPS{
  public static void main(String args[]){
    //the constructor is automatically called when the object is created.
    Student s1 = new Student();
  }
}

class Student {
  String name;
  int roll;
  
  //this is the Constructor 
  Student(){
    System.out.println("Constructor is called..");
  }
}
//Constructors
