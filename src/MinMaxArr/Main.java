package MinMaxArr;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int girilenSayi = 5;

        int enBuyukKucuk = Integer.MIN_VALUE;
        int enKucukBuyuk = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < girilenSayi && i > enBuyukKucuk) {
                enBuyukKucuk = i;
            }
            if (i > girilenSayi && i < enKucukBuyuk) {
                enKucukBuyuk = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enBuyukKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enKucukBuyuk);
    }
}
