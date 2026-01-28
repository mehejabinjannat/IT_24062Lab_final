// Q2: Inheritance & Method Overriding (WITH SUBCLASSES)

class Employee {
    double calculateSalary() { return 0; }
}

class FullTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 50000; // fixed monthly salary
    }
}

class PartTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 200 * 80; // hourly based
    }
}

public class Q2Test {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(); // superclass reference
        Employee e2 = new PartTimeEmployee();

        System.out.println("Full Time Salary: " + e1.calculateSalary());
        System.out.println("Part Time Salary: " + e2.calculateSalary());
    }
}
