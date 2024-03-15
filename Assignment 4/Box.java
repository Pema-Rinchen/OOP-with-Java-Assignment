public class Box {
    // Private variables
    private double length;
    private double width;
    private double height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to find and print values of private variables
    public void printBoxDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    public static void main(String[] args) {
        // Create an instance of Box
        Box myBox = new Box(5.0, 3.0, 2.0);

        // Call the method to print the values of private variables
        myBox.printBoxDetails();
    }
}
