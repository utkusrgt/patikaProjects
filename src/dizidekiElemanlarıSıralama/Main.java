package dizidekiElemanlarıSıralama;

import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.print("Please enter the length : ");
        int n = input.nextInt();

        int[] list = new int[n];

        System.out.println("Lütfen " + n + " adet sayıyı giriniz:");

            for (int i = 0 ; i < n ; i++){
                System.out.print("Please enter " + (i + 1) + ". number : " );
                int sayi = input.nextInt();
                list[i] = sayi;
            }

            Arrays.sort(list);
            System.out.println("Girilen Liste: " + Arrays.toString(list));


    }
}
