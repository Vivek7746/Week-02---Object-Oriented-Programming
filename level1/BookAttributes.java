import java.util.Scanner;
class Book{
    private String title;
    private String author;
    private int price;

    // Constructor
    Book(String title, String author, int price){

        // Setting current values
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void Display(){

        // Displaying all the details of the Book
        System.out.println("Title of the Book is \"" + title + "\"");
        System.out.println("Author of the Book is \"" + author + "\"");
        System.out.println("Price of the Book is \"" + price + "\"");
    }
}
class BookAttributes {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the Title of the Book : ");
        String title = input.nextLine();
        System.out.print("Enter the Author's name of the Book : ");
        String author = input.nextLine();
        System.out.print("Enter the Price of the Book : ");
        int price = input.nextInt();

        // Calling the constructor and assigning the values
        Book Book1 = new Book(title, author, price);

        Book1.Display();        
    }    
}