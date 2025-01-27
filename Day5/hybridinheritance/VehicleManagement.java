// Superclass: Vehicle
class Vehicle {
    // Common attributes for all vehicles
    protected String model;
    protected int maxSpeed;

    // Constructor for Vehicle
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable
interface Refuelable {
    // Abstract method for refueling
    void refuel();
}

// Subclass: ElectricVehicle (inherits from Vehicle)
class ElectricVehicle extends Vehicle {
    // Additional attribute for ElectricVehicle
    private int batteryCapacity; // in kWh

    // Constructor for ElectricVehicle
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed); // Call superclass constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle with " + batteryCapacity + " kWh capacity.");
    }
}

// Subclass: PetrolVehicle (inherits from Vehicle, implements Refuelable)
class PetrolVehicle extends Vehicle implements Refuelable {
    // Additional attribute for PetrolVehicle
    private double fuelCapacity; // in liters

    // Constructor for PetrolVehicle
    public PetrolVehicle(String model, int maxSpeed, double fuelCapacity) {
        super(model, maxSpeed); // Call superclass constructor
        this.fuelCapacity = fuelCapacity;
    }

    // Implement refuel method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle with " + fuelCapacity + " liters of fuel.");
    }
}

// Main Class to Test the Implementation
public class VehicleManagement {
    public static void main(String[] args) {
        // Create instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);

        // Display details and specific functionalities
        ev.displayDetails();
        ev.charge();
        System.out.println();

        pv.displayDetails();
        pv.refuel();
    }
}
