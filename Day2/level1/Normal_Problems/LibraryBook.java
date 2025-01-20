class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Parameterized constructor
    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java Programming", "John Doe", 29.99, true);

        System.out.println("Borrowing book: " + (book.borrowBook() ? "Success" : "Unavailable"));
        System.out.println("Borrowing book again: " + (book.borrowBook() ? "Success" : "Unavailable"));
    }
}
