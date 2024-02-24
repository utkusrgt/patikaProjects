package factorial;

import java.util.Scanner;
import java.util.concurrent.RunnableFuture;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int  n = 1, r = 1, a , b, nMinusr = 1;

        System.out.print("Please enter the number to calculate as factorial : ");
        a = inp.nextInt();
        System.out.print("Please enter the number to calculate as factorial : ");
        b = inp.nextInt();

        for (int i = 1; i <= a; i++){

            n *= i;

        }

        for(int j = 1; j <= b; j++){

            r *= j ;

        }

        for(int k = 1; k <= a- b; k++){

            nMinusr *= k ;

        }

        System.out.print( n / (r * nMinusr));

    }
}
