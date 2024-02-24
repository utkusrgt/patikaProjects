package armstrong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int n = input.nextInt();
        int basValue;
        int sum = 0;

            while (n != 0){
                basValue = n % 10;

                sum += basValue;
                n /= 10;
            }
                System.out.print(sum);
    }
}
