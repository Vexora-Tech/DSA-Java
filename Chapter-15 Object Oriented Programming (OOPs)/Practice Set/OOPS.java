//Q1
import java.util.Scanner;
class Complex {
  double real, imag;

  Complex(double r, double i) {
    real = r;
    imag = i;
  }

  void add(Complex c) {
    System.out.println("Sum        : " + (real + c.real) + " + " + (imag + c.imag) + "i");
  }

  void subtract(Complex c) {
    System.out.println("Difference : " + (real - c.real) + " + " + (imag - c.imag) + "i");
  }

  void multiply(Complex c) {
    double r = real * c.real - imag * c.imag;
    double i = real * c.imag + imag * c.real;
    System.out.println("Product    : " + r + " + " + i + "i");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter real and imaginary part of C1: ");
    Complex c1 = new Complex(sc.nextDouble(), sc.nextDouble());

    System.out.print("Enter real and imaginary part of C2: ");
    Complex c2 = new Complex(sc.nextDouble(), sc.nextDouble());

    c1.add(c2);
    c1.subtract(c2);
    c1.multiply(c2);
  }
}


//Q2
//B. Driving electric car
// The drive() method in the Car class does not override the version in the Automobile class
// since the method is not visible to the Car class.

// The drive() method in the ElectricCar class is a valid override of the method in the Car class,
// with the access modifier expanding in the subclass.
// For these reasons, the code compiles, and Option D is incorrect.

// In the main() method, the object created is an ElectricCar, even if it is assigned to a Car reference.
// Due to polymorphism, the method from the ElectricCar will be invoked,
// making Option B the correct answer.


//Q3
//B. public and protected both can be used.
//You can provide only a less restrictive or same-access modifier when overriding a method.


//Q4
//C. 13245
// The class is loaded first, with the static initialization block called and 1 is outputted first.

// When the BlueCar is created in the main() method, the superclass initialization happens first.
// The instance initialization blocks are executed before the constructor, so 32 is outputted next.

// Finally, the class is loaded with the instance initialization blocks again being called before
// the constructor, outputting 45.

// The result is that 13245 is printed, making Option C the correct answer.

//Practice Set

