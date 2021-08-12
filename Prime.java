import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int num = input.nextInt();
        input.close();

        int count = 0;

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                count++;
                break;
            }
        }

        if(count == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}
