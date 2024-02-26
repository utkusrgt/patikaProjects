package recursivePow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değerini giriniz:");
        int a = scanner.nextInt();
        System.out.print("Üs değerini giriniz:");
        int b = scanner.nextInt();
        System.out.print("Sonuç: " + power(a, b));
    }

    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }
}


// 2^3 = 2 * 2^2
// 2^2 = 2 * 2^1
// 2^1 = 2 * 1


