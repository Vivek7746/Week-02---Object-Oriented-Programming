class Course {
    private String courseName;
    private int duration; // in weeks
    private double fee;
    private static String instituteName = "Tech Institute"; // Class variable common to all courses

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 6, 300.00);
        Course course2 = new Course("Data Science", 8, 500.00);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("Advanced Tech Academy");

        course1.displayCourseDetails(); // Verify updated institute name
    }
}
