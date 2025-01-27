// Super class
class Employee{

    // Attributes
    String name;
    int id;
    int salary;

    // Constructor of Employee class
    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to Display details
    void displayDetails(){
        System.out.printf("-----------------------------------%n");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
    }
}

// Base class 1
class Manager extends Employee{

    // Attributes
    int teamSize;

    // Constructor
    Manager(String name, int id, int salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Method to display details
    void displayDetails(){
        super.displayDetails();
        System.out.println("Size of Team : " + teamSize);
        System.out.printf("-----------------------------------%n%n");
    }
}

// Base class 2
class Developer extends Employee{

    // Attributes
    String programmingLanguage;

    // Constructor
    Developer(String name, int id, int salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Method to display details
    void displayDetails(){
        super.displayDetails();
        System.out.println("Domain Language : " + programmingLanguage);
        System.out.printf("-----------------------------------%n%n");
    }
}

// Base class 3
class Intern extends Employee{

    // Constructor
    Intern(String name, int id, int salary){
        super(name, id, salary);
    }

    // Method to display details
    void displayDetails(){
        super.displayDetails();
        System.out.printf("-----------------------------------%n%n");
    }
}

class EmployeeManagementSystem{
    public static void main(String[] args){

        // Creating Objects of each Sub-Class
        Manager manager = new Manager("vivek", 89, 20000, 10);
        Developer developer = new Developer("vishal", 90, 30000, "JAVA");
        Intern intern = new Intern("yash", 45, 10000);

        // Calling method to Show Details
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}