public class Box_vol {
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

    // Method to calculate and print the volume of the box
    public void printVolume() {
        double volume = length * width * height;
        System.out.println("Volume of the box: " + volume);
    }

    public static void main(String[] args) {
        // Create an instance of Box
        Box myBox = new Box(5.0, 3.0, 2.0);

        // Call the method to print the volume of the box
        myBox.printVolume();
    }
}
