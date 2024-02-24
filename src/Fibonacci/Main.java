package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements will the Fibonacci series be calculated? : ");
        int elemanSayisi = scanner.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.println(elemanSayisi + " element Fibonacci series : ");
        System.out.print(firstNumber + ", " + secondNumber);

        for (int i = 2; i < elemanSayisi; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print( ", " + nextNumber );

            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
