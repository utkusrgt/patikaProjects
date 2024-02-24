package factorial;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);

        int  f = 1;

        System.out.print("Please enter the number to calculate as factorial : ");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++){

            f = f * i;

        }
        System.out.print( n +  "! is " + f);
    }
}
