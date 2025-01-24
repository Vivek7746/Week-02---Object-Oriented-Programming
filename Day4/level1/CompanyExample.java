import java.util.*;

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }
}

public class CompanyExample {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department itDept = new Department("IT");
        itDept.addEmployee(new Employee("Alice"));
        itDept.addEmployee(new Employee("Bob"));

        company.addDepartment(itDept);

        System.out.println("Company: " + company.name + " has " + company.departments.size() + " departments.");
    }
}