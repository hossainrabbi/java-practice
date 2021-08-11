import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num, fact = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer for Factorial: ");
        num = input.nextInt();
        input.close();

        for (int i = num; i >= 1; i--) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + "! = " + fact);
    }
}
