package salaryCalc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



        int workHours;

        Scanner inp = new Scanner(System.in);


        System.out.println("Please enter your work hours : ");
        workHours = inp.nextInt();

        // Örnek kullanım
        Employee employee = new Employee("Utku Sürgit", 2000, workHours, 2020);


        employee.toStringa();





    }
}
