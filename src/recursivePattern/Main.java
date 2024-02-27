import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int n = 16;
        seq(n);
    }

    public static void seq(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        seq(n - 5);
        System.out.print(n + " ");


    }
}




