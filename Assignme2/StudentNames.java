public class StudentNames {
    public static void main(String[] args) {
        // Check if there are command line arguments
        if (args.length == 0) {
            System.out.println("No student names provided.");
            return;
        }

        // Print each student name provided as command line argument
        System.out.println("Student Names:");
        for (String name : args) {
            System.out.println(name);
        }
    }
}
