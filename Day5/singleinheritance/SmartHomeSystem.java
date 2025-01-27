// Superclass: Device
class Device {
    // Attributes for the Device class
    protected String deviceId;
    protected String status;

    // Constructor for Device
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat (extends Device)
class Thermostat extends Device {
    // Additional attribute for Thermostat
    private int temperatureSetting;

    // Constructor for Thermostat
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        // Call the constructor of the superclass
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding the displayStatus method to include temperature settings
    @Override
    public void displayStatus() {
        super.displayStatus(); // Display device details
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to test the implementation
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create an instance of Thermostat
        Thermostat thermostat = new Thermostat("T456", "Online", 24);
        // Display the status of the thermostat
        thermostat.displayStatus();
    }
}
