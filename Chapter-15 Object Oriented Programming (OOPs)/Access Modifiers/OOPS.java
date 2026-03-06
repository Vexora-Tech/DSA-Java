public class OOPS{
  public static void main(String args[]){
    bankAccount myAcc = new bankAccount();
    myAcc.userName = "vansh";
    System.out.println(myAcc.userName);

    //We can't Access the password because it have private access modifier
    myAcc.password = "agsjda";

    //setpassword function only sets the password
    myAcc.setpassword("abcdefghijklm");
  }
}

class bankAccount {
  public String userName;
  private String password;

//sets the password
  void setPassword(String pwd){
    password = pwd;
  }
}
//Access Modifiers

//these are access modifiers
//- private 
//- default
//- protected
//- public