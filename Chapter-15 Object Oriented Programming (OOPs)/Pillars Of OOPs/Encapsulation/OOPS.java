public class OOPS{
  public static void main(String args[]){
    Pen p1 = new Pen();
    p1.setColor("blue");
    System.out.println(p1.getColor());
  }
}
//Encapsulation is defined as the wrapping up of data & methods under a single unit.
//It also implements data hidding.


//This is Encapsulation
class Pen {
  private String color;
  private int tip;

  String getColor(){
    return this.color;
  }

  void setColor(String color){
    this.color = color;
  }
}
//Encapsulation
