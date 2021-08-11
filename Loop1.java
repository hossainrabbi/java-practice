// 1 + 2 + 3 + 4 + .... + n

import java.util.Scanner;

public class Loop1{
    public static void main(String[] args) {
        int n, sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Series number: ");
        n = input.nextInt();
        input.close();

        for(int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println("Total number: " + sum);
    }
}