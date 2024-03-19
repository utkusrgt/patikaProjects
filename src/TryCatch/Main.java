package TryCatch;
import java.util.Scanner;

public class Main {

    public static String getElementAtIndex(int index) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 10 elemanlı dizi

        try {
            return "Dizinin " + index + ". indeksindeki eleman: " + array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Hata: Belirtilen indeks, dizi boyutunun dışında.";
        }
    }

    public static void main(String[] args) {

        int index;

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter an Index : ");
        index = inp.nextInt();
        System.out.println(getElementAtIndex(index));
    }


}

