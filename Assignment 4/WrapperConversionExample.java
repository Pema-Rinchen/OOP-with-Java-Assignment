import java.util.Scanner;

public class WrapperConversionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer value
        System.out.print("Enter an integer value: ");
        int intValue = scanner.nextInt();

        // Input a character value
        System.out.print("Enter a character value: ");
        char charValue = scanner.next().charAt(0);

        // Input a double value
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        // Convert primitive data types to wrapper objects
        Integer integerWrapper = Integer.valueOf(intValue);
        Character charWrapper = Character.valueOf(charValue);
        Double doubleWrapper = Double.valueOf(doubleValue);

        // Print out the values stored in the wrapper objects
        System.out.println("Integer value: " + integerWrapper);
        System.out.println("Character value: " + charWrapper);
        System.out.println("Double value: " + doubleWrapper);

        scanner.close();
    }
}
