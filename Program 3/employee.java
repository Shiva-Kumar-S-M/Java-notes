import java.io.*;

public class Employee {
    private int empId;
    private String name;
    private double salary;
    private double percent;

    public Employee() {}

    public Employee(int id, String name, double salary) {
        this.empId = id;
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        this.salary = this.salary + (this.salary * percentage) / 100;
        System.out.println("Salary after the raise:");
        display();
    }

    public void display() {
        System.out.println();
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
    }

    public static void main(String[] args) {
        try {
            System.out.print("Enter the Employee ID: ");
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(reader);
            int empId = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Enter the Name: ");
            String empName = bufferedReader.readLine();
            System.out.print("Enter the Salary: ");
            double empSal = Double.parseDouble(bufferedReader.readLine());
            Employee emp = new Employee(empId, empName, empSal);
            emp.display();
            System.out.print("Enter the Raise in Salary in Percentage: ");
            double percentage = Double.parseDouble(bufferedReader.readLine());
            emp.raiseSalary(percentage);
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}