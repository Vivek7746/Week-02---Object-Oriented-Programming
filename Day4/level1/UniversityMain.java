import java.util.ArrayList;
import java.util.List;

// Faculty class
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department class
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// University class
class University {
    private String name;
    private List<Department> departments; // Composition relationship
    private List<Faculty> facultyMembers; // Aggregation relationship

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void showDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department department : departments) {
            System.out.println("- " + department.getName());
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            System.out.println("- " + faculty.getName());
        }
    }

    public void deleteUniversity() {
        departments.clear(); // Delete all departments (composition)
        System.out.println("University and its departments have been deleted.");
    }
}

public class UniversityMain {
    public static void main(String[] args) {
        // Creating Faculty members
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");

        // Creating a University
        University university = new University("Tech University");

        // Adding Departments to the University
        Department csDepartment = new Department("Computer Science");
        Department bioDepartment = new Department("Biology");
        university.addDepartment(csDepartment);
        university.addDepartment(bioDepartment);

        // Adding Faculty members to the University
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Display University details
        System.out.println("Before Deleting University:");
        university.showDetails();

        // Deleting the University
        university.deleteUniversity();

        // Showing that Faculty members still exist
        System.out.println("\nFaculty members still exist:");
        System.out.println(faculty1.getName());
        System.out.println(faculty2.getName());
    }
}
