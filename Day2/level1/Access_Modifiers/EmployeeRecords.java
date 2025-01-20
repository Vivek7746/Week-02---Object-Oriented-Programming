class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

// Subclass to demonstrate access to public and protected members
class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID); // Accessing public member
        System.out.println("Department: " + department); // Accessing protected member
        System.out.println("Salary: $" + getSalary());
        System.out.println("Team Size: " + teamSize);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Manager manager = new Manager(1001, "IT", 75000.00, 10);
        manager.displayDetails();
        manager.setSalary(80000.00);
        System.out.println("Updated Salary: $" + manager.getSalary());
    }
}
