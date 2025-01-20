import java.util.*;
class Item{
    
    // Attributes of Item
    int itemCode;
    String itemName;
    int price;
    int quantity;

    // Assigning values to the item
    Item(int itemCode, String itemName, int price, int quantity){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to print Item details
    void Display(){
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Item Price : " + price);
        System.out.println("Item Quantity : " + quantity);
        System.out.println("Total Price : " + price*quantity);
    }
}
class ItemTracker {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Taking input from the user

        System.out.println("Enter the Code of the Item : ");
        int itemCode = input.nextInt();
        System.out.println("Enter the Name of the Item : ");
        String itemName = input.next();
        System.out.println("Enter the Price of the Item : ");
        int price = input.nextInt();
        System.out.println("Enter the Quantity of the Item : ");
        int quantity = input.nextInt();

        // making Object and Calling Constructor
        Item Item1 = new Item(itemCode, itemName, price, quantity);

        // Displaying the details
        Item1.Display();

        input.close();
    }
}
