package Taxi;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        int km;
        double perkm = 2.20, sum = 10;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter the distance in KM : ");
        km = inp.nextInt();

        sum += (km * perkm);

        sum = (sum < 20) ? 20 : sum;

        System.out.print("Total Fee : " + sum + "£");

    }
}
