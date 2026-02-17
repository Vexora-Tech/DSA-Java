import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ")
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=num; i++){
            sum += i;
        }
        System.out.println("the sum of n natural number is : " + sum);
    }
}
//sum of n natural numbers


