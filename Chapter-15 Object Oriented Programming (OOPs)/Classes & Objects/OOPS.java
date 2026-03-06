public class OOPS{
  public static void main(String args[]){
    //Objects
    Pen p1 = new Pen();   //created a pen object called p1.
    p1.setColor("blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);

    //we can also set the color like this
    p1.color = "yellow";
    System.out.println(p1.color);
  }
}

//Class
class Pen {
  String color;
  int tip;

  void setColor(String newColor){
    color = newColor;
  }

  void setTip(int newTip){
    tip = newTip;
  }
}
//Classes & Objects