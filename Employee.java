package practice;

public class Employee {


    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;

    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double calculateYearlySalary() {
        double yearlySalary = monthlySalary * 12;
        return yearlySalary;
    }

    public double getRaiseSalary() {
        double raiseSalary = (calculateYearlySalary() * 0.1) + calculateYearlySalary();
        return raiseSalary;
    }
}

