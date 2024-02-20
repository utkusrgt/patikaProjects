package manav;

import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        //variables assigned

        double armut, elma, domates, muz, patlıcan, armutfiyat = 2.14, elmafiyat = 3.67, muzfiyat = 0.95,domatesfiyat = 1.11, patlıcanfiyat = 5.00;

        //scanner

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürünlerin miktarını kilo cinsinden yazın : ");
        System.out.print("Armut kaç kilo ? : ");
        armut = inp.nextDouble();

        System.out.print("Elma kaç kilo ? : ");
        elma = inp.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        domates = inp.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        muz = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo ? : ");
        patlıcan = inp.nextDouble();

        //let's calculate the sum with a simple arithmetic operation. Basically, product*product price and sum it all together.

        double toplam = ((armut * armutfiyat) + (elma * elmafiyat) + (domates * domatesfiyat) + (muz * muzfiyat) + (patlıcan * patlıcanfiyat));
        System.out.println("Toplam Tutar : " + toplam + " TRY");


    }
}
