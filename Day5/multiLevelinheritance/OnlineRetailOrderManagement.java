// Base Class: Order
class Order {
    // Common attributes for all orders
    protected String orderId;
    protected String orderDate;

    // Constructor for Order
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get the current order status
    public String getOrderStatus() {
        return "Order placed";
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass: ShippedOrder (extends Order)
class ShippedOrder extends Order {
    // Additional attribute for shipped orders
    protected String trackingNumber;

    // Constructor for ShippedOrder
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call the superclass constructor
        this.trackingNumber = trackingNumber;
    }

    // Overriding the getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}

// Subclass: DeliveredOrder (extends ShippedOrder)
class DeliveredOrder extends ShippedOrder {
    // Additional attribute for delivered orders
    private String deliveryDate;

    // Constructor for DeliveredOrder
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call the superclass constructor
        this.deliveryDate = deliveryDate;
    }

    // Overriding the getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }

    // Display delivery details
    public void displayDeliveryDetails() {
        displayOrderDetails(); // Display base class order details
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main Class to Test the Implementation
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Create an instance of DeliveredOrder
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD123", "2025-01-20", "TRK456789", "2025-01-23");
        
        // Display details and status
        deliveredOrder.displayDeliveryDetails();
        System.out.println("Order Status: " + deliveredOrder.getOrderStatus());
    }
}
