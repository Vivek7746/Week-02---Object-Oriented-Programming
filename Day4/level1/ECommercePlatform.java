import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order Details:");
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed a new order.");
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Customer customer = new Customer("Emma Davis");
        Product product1 = new Product("Laptop", 1200);
        Product product2 = new Product("Headphones", 200);

        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);

        customer.placeOrder(order);
        order.showOrderDetails();
    }
}