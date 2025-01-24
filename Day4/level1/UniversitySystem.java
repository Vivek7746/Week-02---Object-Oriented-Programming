import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " is assigned to " + courseName + ".");
    }

    public void enrollStudent(Student student) {
        students.add(student);
        student.addCourse(this);
        System.out.println("Student " + student.getName() + " is enrolled in " + courseName + ".");
    }

    public String getCourseName() {
        return courseName;
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student student1 = new Student("Lucas Green");
        Professor professor1 = new Professor("Dr. Emily Carter");
        Course course1 = new Course("Data Structures");

        course1.assignProfessor(professor1);
        course1.enrollStudent(student1);
    }
}