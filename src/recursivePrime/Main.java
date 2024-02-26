package recursivePrime;

import java.util.Scanner;

public class Main {
    static boolean isPrime(int n, int i)
    {
        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)

            return true;
        // Check for next divisor
        return isPrime(n, i + 1);
    }


    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Let's see if a number prime or not! \nPlease type " + 0 + " to exit the program! ");

        while(true) {

            System.out.print("Please enter a number : ");
            int n = input.nextInt();

            if (isPrime(n, 2))
            System.out.println("Yes it's a Prime");
            else
            System.out.println("Not a Prime");

            if(n == 0){
                System.out.println("Good day!");
                break;
            }

        }
    }
}