package harmonicAverage;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int n = numbers.length;
        double harmonikToplam = 0;

        for (int i = 0; i < n; i++) {
            harmonikToplam += 1.0 / numbers[i];
        }

        double harmonikOrtalama = n / harmonikToplam;

        System.out.println("Dizinin Harmonik Ortalaması: " + harmonikOrtalama);
    }
}