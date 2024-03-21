import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input for number of elements for the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        // giving input for the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        // taking input for the element to search
        System.out.print("Enter the element to search: ");
        int key=scanner.nextInt();

        int index = linearSearch(arr, key);
        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }

        scanner.close();
    }

    // Function to perform linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
