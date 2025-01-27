// Superclass: Person
class Person {
    // Common attributes for all people
    protected String name;
    protected int id;

    // Constructor for Person
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display personal details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    // Abstract method for performing duties
    void performDuties();
}

// Subclass: Chef (inherits from Person, implements Worker)
class Chef extends Person implements Worker {
    // Additional attribute for Chef
    private String specialty;

    // Constructor for Chef
    public Chef(String name, int id, String specialty) {
        super(name, id); // Call superclass constructor
        this.specialty = specialty;
    }

    // Implement performDuties method
    @Override
    public void performDuties() {
        System.out.println("Preparing dishes, especially " + specialty + ".");
    }
}

// Subclass: Waiter (inherits from Person, implements Worker)
class Waiter extends Person implements Worker {
    // Additional attribute for Waiter
    private int tablesAssigned;

    // Constructor for Waiter
    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id); // Call superclass constructor
        this.tablesAssigned = tablesAssigned;
    }

    // Implement performDuties method
    @Override
    public void performDuties() {
        System.out.println("Serving food and managing " + tablesAssigned + " tables.");
    }
}

// Main Class to Test the Implementation
public class RestaurantManagement {
    public static void main(String[] args) {
        // Create instances of Chef and Waiter
        Chef chef = new Chef("Alice", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Bob", 102, 5);

        // Display details and duties
        chef.displayDetails();
        chef.performDuties();
        System.out.println();

        waiter.displayDetails();
        waiter.performDuties();
    }
}
