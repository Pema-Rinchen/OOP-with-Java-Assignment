public class ParameterizedMethodsDemo {

    // Method to swap two integers using call by value
    public static void swap(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("Before calling swap method: num1 = " + num1 + ", num2 = " + num2);
        swap(num1, num2);
        System.out.println("After calling swap method: num1 = " + num1 + ", num2 = " + num2);
    }
}
