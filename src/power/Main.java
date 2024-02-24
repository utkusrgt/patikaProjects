package power;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the base: ");
        int base = scanner.nextInt();

        System.out.print("Please enter the power: ");
        int pwr = scanner.nextInt();

        int result = 1;
        for (int i = 1; i <= pwr; i++) {
            result *= base;
        }

        System.out.println(base + "^" + pwr + " = " + result);
    }
}