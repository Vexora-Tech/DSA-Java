import java.util.*;

public class JavaBasics{
  public static int Factorial(int num){
    int f = 1;
    for(int i=1; i<=num; i++){
      f = f * i;
    }
    return f;   //factorial of n 
  }

  public static int binCoeff(int n, int r){
    int fact_n = Factorial(n);
    int fact_r = Factorial(r);
    int fact_nmr = Factorial(n-r);

    int binCoeff = fact_n / (fact_r * fact_nmr);
    return binCoeff;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    int r = sc.nextInt(); 
    System.out.println(binCoeff(n, r));
  } 
}
//Find binomial coefficient

