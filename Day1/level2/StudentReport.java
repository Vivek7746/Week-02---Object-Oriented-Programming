import java.util.*;
class Student{
    
    // Attributes
    String name;
    int rollNumber;
    int marks;
    char grade;

    // Constructor to assign values
    Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate Grade
    void CalculateGrade(){
        if(marks >= 90){
            grade = 'A';
        }
        else if(marks >= 80){
            grade = 'B';
        }
        else if(marks >= 60){
            grade = 'C';
        }
        else if(marks >= 40){
            grade = 'D';
        }
        else grade = 'F';
    }

    void display(){

        System.out.println(name + "'s marks : " + marks);
        System.out.println(name + "'s roll number : " + rollNumber);
        System.out.println(name + "'s grades : " + grade);
    }
}
class StudentReport{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the name of the student : ");
        String name = input.next();
        System.out.print("Enter the roll number of the student : ");
        int rollNumber = input.nextInt();
        System.out.print("Enter the marks of the student : ");
        int marks = input.nextInt();

        Student student1 = new Student(name, rollNumber, marks);
        student1.CalculateGrade();

        student1.display();

        input.close();
    }
}