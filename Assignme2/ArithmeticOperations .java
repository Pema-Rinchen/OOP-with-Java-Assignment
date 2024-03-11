public class ArithmeticOperations {
    public static void main(String[] args) {
        // Check if exactly two command line arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two integer numbers.");
            return;
        }

        // Parse the command line arguments as integers
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Perform addition and subtraction
            int sum = num1 + num2;
            int difference = num1 - num2;

            // Display the results
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
        } catch (NumberFormatException e) {
            // Handle the case where the command line arguments cannot be parsed as integers
            System.out.println("Please provide valid integer numbers.");
        }
    }
}
