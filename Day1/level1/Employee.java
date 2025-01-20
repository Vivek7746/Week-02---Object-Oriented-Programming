class Employee{

    // Creating Members/Attributes
    public String name;
    public String id;
    public int salary;

    // Constructor to set values
    Employee(String name, String id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Creating Member functions to display Employee's details
    public void display(){
        System.out.println("Employee's name is " + name);
        System.out.println("Employee's ID is " + id);
        System.out.println("Employee's salary is " + salary);
    }

    public static void main(String[] args){

        // Creating object
        Employee Ramesh = new Employee("Ramesh Sharma", "111", 50000);

        // Printing Ramesh details
        Ramesh.display();

        System.out.print('\n');

        // Creating object
        Employee Suresh = new Employee("Suresh Gupta", "112", 90000);
        
        // Printing Suresh details
        Suresh.display();
    }
}