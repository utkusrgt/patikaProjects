package chineseZodiac;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();


        int zodiac = birthYear % 12;
        String zodiacType;

        switch (zodiac) {
            case 0:
                zodiacType = "Monkey";
                break;
            case 1:
                zodiacType = "Rooster";
                break;
            case 2:
                zodiacType = "Dog";
                break;
            case 3:
                zodiacType = "Pig";              //// Chinese zodiac types
                break;
            case 4:
                zodiacType = "Mouse";
                break;
            case 5:
                zodiacType = "Ox";
                break;
            case 6:
                zodiacType = "Tiger";
                break;
            case 7:
                zodiacType = "rabbit";
                break;
            case 8:
                zodiacType = "Dragon";
                break;
            case 9:
                zodiacType = "Snake";
                break;
            case 10:
                zodiacType = "Horse";
                break;
            case 11:
                zodiacType = "Goat";
                break;
            default:
                zodiacType = "n/a";
                break;
        }

        System.out.println("Your Zodiac is : " + zodiacType);
    }
}