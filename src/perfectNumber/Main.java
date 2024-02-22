package perfectNumber;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int i, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please type in a positive number: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Please type in a positive number");

        } else {

            for (i = 1; i < n; i++) {
                if (n % i == 0) {

                    sum += i;

                }

            }
            if (sum == n) {
                System.out.println(n + " is a perfect number.");

            } else {
                System.out.println(n + " is not a perfect number.");

            }

        }

    }

}
