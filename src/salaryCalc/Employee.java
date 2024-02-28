package salaryCalc;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Constructor
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // TAX
    public double tax() {
        if (salary > 1000) {
            return salary * 0.03; // %3 tax
        } else {
            return 0; // No tax
        }
    }

    // BONUS
    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30; // 30 TL bonus for each extra hour
        } else {
            return 0; // No bonus
        }
    }

    // Salary increment
    public void raiseSalary() {
        int yearsWorked = 2021 - hireYear;

        if (yearsWorked < 10) {
            salary *= 1.05; // %5
        } else if (yearsWorked < 20) {
            salary *= 1.10; // %10
        } else {
            salary *= 1.15; // %15
        }
    }
    public double calculateFinalSalary() {
        raiseSalary();
        double finalSalary = salary - tax() + bonus();
        return finalSalary;
    }

    // Print

    public void toStringa() {

        System.out.println("Name : " + name );
        System.out.println("Salary : " + salary );
        System.out.println("Workhours : " + workHours );
        System.out.println("Hired : " + hireYear );
        System.out.println("Before raise : " + salary);
        System.out.println("Bonus: " + bonus());
        System.out.println("Tax : " + tax());
        System.out.println("Salary : " + calculateFinalSalary());




    }
}


