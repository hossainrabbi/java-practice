import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a multiplication number: ");
        num = input.nextInt();
        input.close();

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
