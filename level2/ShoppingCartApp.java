import java.util.*;

class ShoppingCart {

    // Attributes to hold item details
    String[] itemNames;
    double[] prices;
    int[] quantities;
    int itemCount;

    // Constructor to initialize the cart with a fixed size
    ShoppingCart(int size) {
        itemNames = new String[size];
        prices = new double[size];
        quantities = new int[size];
        itemCount = 0;
    }

    // Method to add an item to the cart
    void addItem(String itemName, double price, int quantity) {
        if (itemCount < itemNames.length) {
            itemNames[itemCount] = itemName;
            prices[itemCount] = price;
            quantities[itemCount] = quantity;
            itemCount++;
            System.out.println(quantity + " x " + itemName + " added to the cart.");
        } else {
            System.out.println("The cart is full. Cannot add more items.");
        }
    }

    // Method to remove an item from the cart
    void removeItem(String itemName) {
        boolean itemFound = false;
        for (int i = 0; i < itemCount; i++) {
            if (itemNames[i].equalsIgnoreCase(itemName)) {
                itemFound = true;
                System.out.println(itemNames[i] + " removed from the cart.");
                // Shift all items after the removed item one position to the left
                for (int j = i; j < itemCount - 1; j++) {
                    itemNames[j] = itemNames[j + 1];
                    prices[j] = prices[j + 1];
                    quantities[j] = quantities[j + 1];
                }
                itemCount--;
                break;
            }
        }
        if (!itemFound) {
            System.out.println(itemName + " is not in the cart.");
        }
    }

    // Method to display all items in the cart
    void displayCart() {
        if (itemCount == 0) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (int i = 0; i < itemCount; i++) {
                double total = prices[i] * quantities[i];
                System.out.println(itemNames[i] + " | Price: $" + prices[i] + " | Quantity: " + quantities[i] + " | Total: $" + total);
            }
        }
    }

    // Method to display the total cost
    void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += prices[i] * quantities[i];
        }
        System.out.println("Total cost: $" + totalCost);
    }
}

class ShoppingCartApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a shopping cart with a fixed size
        ShoppingCart cart = new ShoppingCart(10);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                input.nextLine(); // Consume the leftover newline
                System.out.print("Enter item name: ");
                String itemName = input.nextLine();
                System.out.print("Enter price: ");
                double price = input.nextDouble();
                System.out.print("Enter quantity: ");
                int quantity = input.nextInt();

                cart.addItem(itemName, price, quantity);

            } else if (choice == 2) {
                input.nextLine(); // Consume the leftover newline
                System.out.print("Enter item name to remove: ");
                String itemName = input.nextLine();
                cart.removeItem(itemName);

            } else if (choice == 3) {
                cart.displayCart();

            } else if (choice == 4) {
                cart.displayTotalCost();

            } else if (choice == 5) {
                System.out.println("Program has been successfully executed");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }
}