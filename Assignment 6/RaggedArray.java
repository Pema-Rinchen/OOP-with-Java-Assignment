import java.util.Scanner;

public class RaggedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows that you want:");
        int n = scan.nextInt();

        // Creating ragged array
        int[][] raggedArr = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number of elements you want in row " + (i + 1) + ":");
            int a = scan.nextInt();
            raggedArr[i] = new int[a];
            System.out.print("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < a; j++) {
                raggedArr[i][j] = scan.nextInt();
            }
        }

        // Printing the ragged array
        System.out.println("Ragged Array:");
        for (int i = 0; i < raggedArr.length; i++) { // row
            for (int j = 0; j < raggedArr[i].length; j++) { // element
                System.out.print(raggedArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
