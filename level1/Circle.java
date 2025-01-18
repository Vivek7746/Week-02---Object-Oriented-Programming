public class Circle {

    // Data members/attributes
    double radius;

    // Constructor
    Circle(int radius){
        this.radius = radius;
    }

    // Method function to get Area of the Circle
    void getArea(){

        // Find Area of the Circle
        double Area = 3.14 * radius * radius;
        System.out.println("The Area of circle is " + Area);
    }

    // Method function to get Circumference of the Circle
    void getCircumference(){

        // Find Circumference of the Circle
        double Circumference = 2 * 3.14 * radius;
        System.out.println("The Circumference of the circle is " + Circumference);
    }

    public static void main(String[] args){
        
        // Creating an object
        Circle circle = new Circle(20);
        
        // Method to get and display Area and Circumference
        circle.getArea();
        circle.getCircumference();
    }
}
