import java.util.Scanner;

public class MultiplicationsTable {
    public static void main(String[] args) {
        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a multiplication first number: ");
        num1 = input.nextInt();

        System.out.print("Enter a multiplication last number: ");
        num2 = input.nextInt();
        input.close();

        for(int i = num1; i <= num2; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (j * i));
            }

            System.out.println();
        }
    }
}
