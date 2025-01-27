// Superclass: Person
class Person {
    // Common attributes for all people
    protected String name;
    protected int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display personal details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    // Additional attribute for Teacher
    private String subject;

    // Constructor for Teacher
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call superclass constructor
        this.subject = subject;
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    // Additional attribute for Student
    private String grade;

    // Constructor for Student
    public Student(String name, int age, String grade) {
        super(name, age); // Call superclass constructor
        this.grade = grade;
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    // Additional attribute for Staff
    private String department;

    // Constructor for Staff
    public Staff(String name, int age, String department) {
        super(name, age); // Call superclass constructor
        this.department = department;
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Main class to test the implementation
public class SchoolSystem {
    public static void main(String[] args) {
        // Create instances of different roles
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Administration");

        // Display details and roles
        teacher.displayDetails();
        teacher.displayRole();
        System.out.println();

        student.displayDetails();
        student.displayRole();
        System.out.println();

        staff.displayDetails();
        staff.displayRole();
    }
}
