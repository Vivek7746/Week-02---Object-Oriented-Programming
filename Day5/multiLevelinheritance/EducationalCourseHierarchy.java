// Base Class: Course
class Course {
    // Common attributes for all courses
    protected String courseName;
    protected int duration; // Duration in hours

    // Constructor for Course
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass: OnlineCourse (extends Course)
class OnlineCourse extends Course {
    // Additional attributes for online courses
    protected String platform;
    protected boolean isRecorded;

    // Constructor for OnlineCourse
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call the superclass constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Display online course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Call the superclass method
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse (extends OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {
    // Additional attributes for paid online courses
    private double fee;
    private double discount; // Discount as a percentage

    // Constructor for PaidOnlineCourse
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call the superclass constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Display paid course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Call the superclass method
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + (fee - (fee * discount / 100)));
    }
}

// Main Class to Test the Implementation
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Create an instance of PaidOnlineCourse
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Programming", 40, "Udemy", true, 199.99, 20);

        // Display course details
        paidCourse.displayCourseDetails();
    }
}
