class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Default constructor
    public CarRental() {
        this("Customer", "Sedan", 1);
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        double dailyRate = carModel.equalsIgnoreCase("SUV") ? 50 : 30;
        return dailyRate * rentalDays;
    }

    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental customRental = new CarRental("Emily", "SUV", 5);

        System.out.println("Default Rental Cost: $" + defaultRental.calculateTotalCost());
        System.out.println("Custom Rental Cost: $" + customRental.calculateTotalCost());
    }
}
