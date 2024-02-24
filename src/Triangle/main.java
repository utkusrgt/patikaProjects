package Triangle;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        int a,b;
        double area;

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter altitude in cm : ");
        a = inp.nextInt();

        System.out.print("Please enter the base in cm : ");
        b = inp.nextInt();

        area = (a * b) / 2;



        System.out.println(area);

    }
}
