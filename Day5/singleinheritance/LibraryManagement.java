// Superclass: Book
class Book {
    // Attributes for the Book class
    protected String title;
    protected int publicationYear;

    // Constructor for Book
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author (extends Book)
class Author extends Book {
    // Additional attributes for Author
    private String name;
    private String bio;

    // Constructor for Author
    public Author(String title, int publicationYear, String name, String bio) {
        // Call the constructor of the superclass
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding the displayInfo method to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display book details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class to test the implementation
public class LibraryManagement {
    public static void main(String[] args) {
        // Create an instance of Author
        Author author = new Author("Java Programming", 2023, "Alice Smith", "An expert in Java development and teaching.");
        // Display the information
        author.displayInfo();
    }
}
