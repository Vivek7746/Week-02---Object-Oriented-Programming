// Super Class
class Vehicle{

    // Attributes
    int maxSpeed;
    String fueltype;

    // Constructor
    Vehicle(int maxSpeed, String fueltype){
        this.maxSpeed = maxSpeed;
        this.fueltype = fueltype;
    }

    // Method to display Vehicle information
    void displayInfo(){
        System.out.printf("-----------------------------------%n");
        System.out.println("Max Speed : "  + maxSpeed);
        System.out.println("Fuel Type : " + fueltype);
    }
}

// Sub Class - 1
class Car extends Vehicle{

    // Attributes
    int numberofSeats;

    // Constructor
    Car(int maxSpeed, String fueltype, int numberofSeats){
        super(maxSpeed, fueltype);
        this.numberofSeats = numberofSeats;
    }

    // Method to display Car information
    void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Seats : " + numberofSeats);
        System.out.printf("-----------------------------------%n%n");
    }
}

// Sub Class - 2
class Truck extends Vehicle{

    // Attributes
    int numberofSeats;

    // Constructor
    Truck(int maxSpeed, String fueltype, int numberofSeats){
        super(maxSpeed, fueltype);
        this.numberofSeats = numberofSeats;
    }

    // Method to display Car information
    void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Seats : " + numberofSeats);
        System.out.printf("-----------------------------------%n%n");
    }
}

// Sub Class - 3
class MotorCycle extends Vehicle{

    // Attributes
    int numberofSeats;

    // Constructor
    MotorCycle(int maxSpeed, String fueltype, int numberofSeats){
        super(maxSpeed, fueltype);
        this.numberofSeats = numberofSeats;
    }

    // Method to display Car information
    void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Seats : " + numberofSeats);
        System.out.printf("-----------------------------------%n%n");
    }
}

public class VehicleSystem {
    public static void main(String[] args){

        // Creating objects array
        Vehicle[] arr = new Vehicle[3];
        arr[0] = new Car(120, "Petrol", 4);
        arr[1] = new Truck(100, "Diesel", 6);
        arr[2] = new MotorCycle(130, "Petrol", 2);

        // Iterating over the Array and Displaying information
        for(int i = 0; i < 3; i++){
            arr[i].displayInfo();
        }
    }
}