package recursiveCalc;

import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum : " + result);
        return result;

    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Extraction : " + result);
        return result;

    }

    static int multip(int a, int b) {
        int result = a * b;
        System.out.println("Multipication : " + result);
        return result;

    }

    static int div(int a, int b) {
        if(b == 0){
            System.out.println("Second number cannot be 0 ");
            return 0;

        }
        int result = a / b;
        System.out.println("Diviation : " + result);
        return result;

    }

    static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {

            result *= a;
        }
        return result;

    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod : " + result);
        return result;

    }
    static int rec(int a, int b) {
        int result = (a * b) / 2;
        int result2 = (a + b) * 2 ;
        System.out.println("Rectangles area is : " + result + "m2, rectangles perimeter is " + result2);
        return result;

    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);

        while (true){

            System.out.print("Please select the operation : ");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }


            System.out.print("Please enter the first number : ");
            int a = scan.nextInt();
            System.out.print("Please enter the second number : ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    multip(a, b);
                    break;
                case 4:
                    div(a, b);

                    break;
                case 5:
                    System.out.println(pow(a,b));

                    break;
                case 6:
                    mod(a, b);

                    break;
                case 7:
                    rec(a, b);
                    break;
                default:
                    System.out.println("Unable to operate");

            }

        }
        System.out.println("Shutting down");


    }
}
