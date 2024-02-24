package calculator;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double n1, n2 ;
        int action;


        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter the first number : ");
        n1 = inp.nextDouble();

        System.out.print("Please enter the second number : ");
        n2 = inp.nextDouble();

        System.out.print("Select the action you want to perform : ");
        action = inp.nextInt();

        switch (action) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println(n1 / n2);
                break;




        }

    }







}
