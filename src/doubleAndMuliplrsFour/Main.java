package doubleAndMuliplrsFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, sum= 0 ;

        Scanner inp = new Scanner(System.in);

        do{

            System.out.print("Please enter a positive number : ");
            n = inp.nextInt();
            if(n % 4 == 0) {
                sum += n;

            }

        }while (n > 0);

        System.out.print("Sum of the numbers that even and multiples of four is : "+sum);

    }
}
