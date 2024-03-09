import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String productId;
    private String name;
    private double price;
    
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    
    // Getters and setters
    public String getProductId() {
        return productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}

// Customer class
class Customer {
    private String customerId;
    private String name;
    private String email;
    
    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }
    
    // Getters and setters
    public String getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}

// Order class
class Order {
    private String orderId;
    private Customer customer;
    private List<Product> products;
    private double totalAmount;
    
    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0;
    }
    
    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice();
    }
    
    // Getters
    public String getOrderId() {
        return orderId;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
    public double getTotalAmount() {
        return totalAmount;
    }
}

// Main class
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("P001", "Laptop", 1000.0);
        Product product2 = new Product("P002", "Smartphone", 500.0);
        
        // Create a customer
        Customer customer = new Customer("C001", "John Doe", "john@example.com");
        
        // Create an order and add products
        Order order = new Order("O001", customer);
        order.addProduct(product1);
        order.addProduct(product2);
        
        // Display order details
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Total Amount: $" + order.getTotalAmount());
        System.out.println("Products:");
        for (Product product : order.getProducts()) {
            System.out.println("- " + product.getName() + ": $" + product.getPrice());
        }
    }
}
