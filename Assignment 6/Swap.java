public class Swap {
    public static void main(String[] args) {
        int[] numbers = {10, 20};
        System.out.println("Before swapping - a: " + numbers[0] + ", b: " + numbers[1]);
        swapByReference(numbers);
        System.out.println("After swapping - a: " + numbers[0] + ", b: " + numbers[1]);
    }

    public static void swapByReference(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
