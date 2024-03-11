public class MessageDisplay {
    public static void main(String[] args) {
        // Check if there is at least one command line argument
        if (args.length > 0) {
            // Concatenate all command line arguments to form the message
            StringBuilder message = new StringBuilder();
            for (String arg : args) {
                message.append(arg).append(" ");
            }
            // Display the message
            System.out.println("Message entered: " + message.toString());
        } else {
            // Display a message indicating no input provided
            System.out.println("No message entered.");
        }
    }
}
