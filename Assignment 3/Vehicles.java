public class Vehicles {
    // Class variables
    private static int totalVehicles = 0;

    // Instance variables
    private String make;
    private String model;
    private int year;
    private double price;

    // Constructor
    public Vehicle(String make, String model, int year, double price) {
        // Use of 'this' keyword to refer to instance variables
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        totalVehicles++;
    }

    // Getter and Setter methods
    public String getMake() {
        return this.make; // Using 'this' to refer to instance variable
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model; // Using 'this' to refer to instance variable
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year; // Using 'this' to refer to instance variable
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price; // Using 'this' to refer to instance variable
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Static method
    public static int getTotalVehicles() {
        return totalVehicles;
    }

    // Other methods
    public void displayDetails() {
        // Using 'this' to refer to instance variables
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Price: $" + this.price);
    }
}
