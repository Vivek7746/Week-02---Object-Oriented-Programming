import java.util.*;

class MovieTicket {

    // Attributes
    String movieName;
    String seatNumber;
    double price;

    // Constructor to assign default values
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Booked";
        this.price = 0.0;
    }

    // Method to book a ticket
    void bookTicket(String seatNumber, double price) {
        if (this.seatNumber.equals("Not Booked")) {
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket is already booked for seat: " + this.seatNumber);
        }
    }

    // Method to display ticket details
    void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: $" + price);
    }
}

class MovieBookingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for the movie name
        System.out.print("Enter the movie name: ");
        String movieName = input.nextLine();

        // Creating a MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName);

        // Infinite loop for the booking system
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Book a Ticket");
            System.out.println("2. Display Ticket Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                if (!ticket.seatNumber.equals("Not Booked")) {
                    System.out.println("A ticket is already booked. Display the details or exit.");
                    continue;
                }

                input.nextLine(); // Consume the leftover newline
                System.out.print("Enter seat number: ");
                String seatNumber = input.nextLine();
                System.out.print("Enter ticket price: ");
                double price = input.nextDouble();

                ticket.bookTicket(seatNumber, price);
            } else if (choice == 2) {
                ticket.displayTicketDetails();
            } else if (choice == 3) {
                System.out.println("Program has been successfully executed");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }
}
