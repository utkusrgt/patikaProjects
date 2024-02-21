package planeTicket;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Flight info

        System.out.print("Please enter the distance in KM : ");
        int distance = scanner.nextInt();

        System.out.print("Please enter your age : ");
        int age = scanner.nextInt();

        System.out.print("Please select the ticket type\n1: One-Way Ticket\n2: Round-Trip Ticket\n*Please note that Round-trip will be calculated as two tickets*: ");
        int ticketType = scanner.nextInt();

        double pricePerKm = 0.10; // price per KM (€/KM)


        if (distance <= 0 || age <= 0 || (ticketType != 1 && ticketType != 2)) {
            System.out.println("Wrong answer, please run the programme again !");        // Value check
            return;
        }

        double sum = distance * pricePerKm; // Normal flight fee


        if (age < 12) {
            sum *= 0.5; // %50
        } else if (age >= 12 && age <= 24) {
            sum *= 0.9; // %10                     // Price reduction conditions
        } else if (age >= 65) {
            sum *= 0.7; // %30
        }

        if (ticketType == 2) {
            sum = (sum * 2);           // If type 2 is selected, fee will be x2 of the fee since it will be a two flight
            sum *= 0.8;                // Price reduction for round trip


        }

        if (ticketType == 2) {
            System.out.println("Round-Trip Price: " + sum + " €");
        }
        else
            System.out.println("One-Way Ticket Price: " + sum + " €");

    }
}