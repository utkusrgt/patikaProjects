package recursivePow;

import java.util.Scanner;

public class Main {


    static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {

            result *= a;
        }
        return result;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;


        while (true){

            System.out.print("Please enter the base number : ");
            int a = scan.nextInt();
            System.out.print("Please enter the power number : ");
            int b = scan.nextInt();

            if (a == 0) {
                break;
            }else{
                System.out.println(a + "^" + b + " is: " + pow(a, b));
            }



        }
    }
}
