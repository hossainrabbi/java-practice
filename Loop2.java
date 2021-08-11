// 1.5^2 + 3.5^2 + 5.5^2 + .... + n

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        double n, sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Series number: ");
        n = input.nextDouble();
        input.close();

        for(double i = 1.5; i <= n; i = i + 2) {
            System.out.print(i * i +  " + ");
            sum = sum + (i * i);
        }

        System.out.println();
        System.out.println("Total number: " + sum);
    }
}
