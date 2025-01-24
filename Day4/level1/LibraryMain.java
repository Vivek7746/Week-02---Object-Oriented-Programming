import java.util.ArrayList;
class Library{

    // Making Array list of Book objects
    public String name;
    public ArrayList<Book> books = new ArrayList<>();

    // Constructor
    public Library(String name){
       this.name = name;
    }

    // Method to set book details
    public void setbook(Book obj){
        this.books.add(obj);
    }

    // Method to display books details
    public void displaybook(){
        System.out.println("In [" + name + "], Books are :-");
        for(Book b : books){
            System.out.println("Title : " + b.title + ", Author : " + b.author);
        }
    }
}

class Book{
    
    // Attributes
    public String title;
    public String author;

    // Constructor for the initialisation
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

class LibraryMain{
    public static void main(String[] args){

        // Creating Book's objects
        Book book1 = new Book("Harry Potter", "Helen");
        Book book2 = new Book("Space Out", "Williams");
        Book book3 = new Book("Lord", "Ben");
        Book book4 = new Book("Algorithm", "Harry");

        // Creating Library's object
        Library library1 = new Library("RGPV Library");
        library1.setbook(book1);
        library1.setbook(book2);

        // Creating another Library's object
        Library library2 = new Library("TIT Library");
        library2.setbook(book3);
        library2.setbook(book4);

        System.out.printf("---------------------------------%n");

        // Printing library1 books
        library1.displaybook();

        System.out.printf("---------------------------------%n");

        // Printing library2 books
        library2.displaybook();

        System.out.printf("---------------------------------%n");
    }
}