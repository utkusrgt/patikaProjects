import java.util.Scanner;

public class nCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the amount of the numbers: ");
        int n = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Please enter the " + i + ". number: ");
            int num = scanner.nextInt();
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
    }
}