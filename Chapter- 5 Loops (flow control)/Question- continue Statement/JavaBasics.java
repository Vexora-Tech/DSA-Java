import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break; // ✅ exits the loop when divisible by 10
            }
            System.out.println("Entered number is not divisible by 10: " + num);
        } while (true);

        System.out.println("Entered number is divisible by 10"); 
    }
}


public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;  // ✅ exits loop when divisible by 10
            }
            System.out.println("Entered number is not divisible by 10: " + num);
        }

        System.out.println("Entered number is divisible by 10");
    }
}

//Question- continue Statement


