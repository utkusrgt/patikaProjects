package Frequency;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};


        Arrays.sort(array);
                            // 5 10 10 10 20 20 20 20
        int length = array.length;
        int count = 1;

        for (int i = 1; i < length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                System.out.println(array[i - 1] + " sayısı " + count + " kere tekrar edildi.");
                count = 1;
            }
        }


        System.out.println(array[length - 1] + " sayısı " + count + " kere tekrar edildi.");
    }
}
