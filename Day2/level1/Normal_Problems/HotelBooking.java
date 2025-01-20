class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to calculate total cost
    public double calculateCost() {
        double rate = roomType.equalsIgnoreCase("Suite") ? 200 : 100;
        return rate * nights;
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("John", "Suite", 3);
        HotelBooking copiedBooking = new HotelBooking(customBooking);

        System.out.println("Default Booking Cost: $" + defaultBooking.calculateCost());
        System.out.println("Custom Booking Cost: $" + customBooking.calculateCost());
        System.out.println("Copied Booking Cost: $" + copiedBooking.calculateCost());
    }
}
