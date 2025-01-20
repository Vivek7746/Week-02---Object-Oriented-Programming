import java.util.Scanner;
class Book{

    // Attributes of Books
    private String title;
    private String author;
    private int price;


    // Constructor to initialise values
    Book(String title, String author, int price){
        
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to get details of the Book
    void getdetails(){
        System.out.println("Title of the Book is " + title);
        System.out.println("Author of the Book is " + author);
        System.out.println("Price of the Book is " + price);
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the title of the Book : ");
        String title = input.next();

        System.out.print("Enter the author of the Book : ");
        String author = input.next();

        System.out.print("Enter the price of the Book : ");
        int price = input.nextInt();

        // Calling constructor and initialising
        Book book1 = new Book(title, author, price);

        book1.getdetails();

        input.close();
    }
}