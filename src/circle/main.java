package circle;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        double 𝜋 = 3.14, alan;
        int r, 𝛼;



        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the r for the radius : " );
        r = inp.nextInt();
        System.out.print("Please enter the \uD835\uDEFC central angle  : " );
        𝛼 = inp.nextInt();

        if (!(𝛼 <= 360) || (𝛼 < 0)) {

            System.out.println("Please enter \uD835\uDEFC between 1-360 ");


        }else {

            alan = (𝜋 * (r*r) * 𝛼) / 360;

            System.out.println(alan);

        }




    }
}
