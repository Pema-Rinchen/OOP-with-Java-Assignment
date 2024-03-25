// Base class
class Box {
    private double width;
    private double height;
    private double depth;

    // Constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    public double calculateVolume() {
        return width * height * depth;
    }
}

// Derived class inheriting from Box
class BoxWeight extends Box {
    private double weight;

    // Constructor
    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    // Method to display weight
    public void displayWeight() {
        System.out.println("Weight: " + weight + " kg");
    }
}

// Derived class inheriting from BoxWeight
class ShipmentCost extends BoxWeight {
    private double costPerKg;

    // Constructor
    public ShipmentCost(double width, double height, double depth, double weight, double costPerKg) {
        super(width, height, depth, weight);
        this.costPerKg = costPerKg;
    }

    // Method to calculate shipment cost
    public double calculateShipmentCost() {
        return weight * costPerKg;
    }
}

public class Main {
    public static void main(String[] args) {
        ShipmentCost shipment = new ShipmentCost(10, 5, 3, 2.5, 5);
        double volume = shipment.calculateVolume();
        double cost = shipment.calculateShipmentCost();

        System.out.println("Volume of the shipment: " + volume + " cubic units");
        shipment.displayWeight();
        System.out.println("Shipment cost: $" + cost);
    }
}
