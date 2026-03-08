//Practice Question 1
//find out the correct statement to assign name to object.
class Student {
  String name;
  int marks;
}
public class OOPS {
  public static void main(String[] args) {
    Student s = new Student();
    //fill here  
  }
}
// a) s->name = "vansh"
// b) Student.name = "vansh"
// c) s.name = "vansh"        ✅


//Practice Question 2
//Which veriables can the class Person access in the following code.
class Person{
  String name;
  int weight;
}
class Student extends Person{
  int rollNumber;
  String schoolName;
}
// a) name        ✅
// b) weight      ✅
// c) rollNumber 
// d) schoolName


//Practice Question 3
//Which of the following modifiers are not allowed in front of the class.
// a) private       ✅
// b) protected     ✅
// c) public 
// d) default


//Practice Question 4
//Which of the following is the correct statement? (both classes are in same package)
class Vehicle{}
class Car extends Vehicle{}
// a) Car c = new Car();                ✅
// b) Vehicle v = new Vehicle();        ✅
// c) Vehicle v = new Car();            ✅
// d) Car c = new Vehicle();


//Practice Question 5
//what will be the output of this code? (both classes in same package)
public class OOPS{
  public static void main(String args[]){
    Vehicle obj1 = new Car();
    obj1.print();

    Vehicle obj2 = new Vehicle();
    obj2.print();
  }
}
class Vehicle{
  void print(){
    System.out.println("Base class (Vehicle)");
  }
}
class Car extends Vehicle{
  void print(){
  System.out.println("Derived class (Car)");
  }
}
//Output
//Derived class (Car)
//Base class (Vehicle)


//Practice Question 6
//what will be the output of this code? (both classes in same package)
public class OOPS{
  public static void main(String args[]){
    Vehicle obj1 = new Car();
    obj1.print1();                    //it will give Error

    Vehicle obj2 = new Vehicle();
    obj2.print();
  }
}
class Vehicle{
  void print(){
    System.out.println("Base class (Vehicle)");
  }
}
class Car extends Vehicle{
  void print1(){
  System.out.println("Derived class (Car)");
  }
}


//Practice Question 7
//Which of the following is not an OOPS Component?
// a) Inheritance
// b) Encapsulation
// c) Polymorphism
// d) Agregation       ✅ 


//Practice Question 8
//what will be the output of this code?
public class OOPS{
  public static void main(String args[]){
    System.out.println(Book.count);
    Book b1 = new Book(150);
    Book b2 = new Book(250);
    System.out.println(Book.count);
  }
}
class Book{
  int price;
  static int count;

  public Book(int price){
    this.price = price;
    count++;
  }
}
//Output
//0 2


//Practice Question 9
//Which line has Error?
class Test{
  static int marks;
  void setMarks(int marks){
    this.marks = marks;                       //Line 1
  }
}
public class OOPS{
  public static void main(String args[]){
    Test t = new Test();
    t.setMarks(98);                           //Line 2
    System.out.println(Test.marks);           //Line 3
  }
}
//NO Error


//Practice Question 10
//What will be the output of the code.
class Test{
  static int a = 30;
  static int b;
  static void changeB(){
    b = a * 3;
  }
}
public class OOPS{
  public static void main(String args[]){
    Test t = new Test();
    t.changeB();
    System.out.println(Test.a + Test.b);
  }
}
//Output
// 40

//Solved Questions Practice

