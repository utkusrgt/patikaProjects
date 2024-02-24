package powerFourFive;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {





        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter the limit : ");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i *= 4){

            System.out.println(i + " ");

        }
        for (int a = 1 ; a <= n ; a *= 5) {

            System.out.println(a + " " );


        }

    }
}
