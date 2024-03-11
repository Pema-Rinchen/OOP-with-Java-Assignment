public class LargestNumber {
    public static void main(String[] args) {
        // Check if there are command line arguments
        if (args.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }

        // Parse the command line arguments as integers
        int[] numbers = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            // Handle the case where the command line arguments cannot be parsed as integers
            System.out.println("Please provide valid integer numbers.");
            return;
        }

        // Find the largest number
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Display the largest number
        System.out.println("Largest number: " + largest);
    }
}
