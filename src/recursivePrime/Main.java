package recursivePrime;

import java.util.Scanner;

public class Main {


    static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.print("Please enter a number : ");
            int a = scan.nextInt();

            if (isPrime(a)) {
                System.out.println(a + " is a prime number.");
                break;
            } else {
                System.out.println(a + " is not a prime number.");
            }
        }
    }
}