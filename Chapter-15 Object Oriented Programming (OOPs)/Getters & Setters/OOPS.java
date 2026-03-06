public class OOPS{
  public static void main(String args[]){
    Pen p1 = new Pen();
    p1.setColor("blue");
    System.out.println(p1.getColor());
  }
}

class Pen {
  private String color;
  private int tip;

  //Getters
  String getColor(){
    return this.color;
  }

  int getTip(){
    return this.tip;
  }

  //Setters
  void setColor(String color){
    this.color = color;
  }

  void setTip(int newTip){
    this.tip = tip;
  }
}
//Getters & Setters
