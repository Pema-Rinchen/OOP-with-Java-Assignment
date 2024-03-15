public class ObjectCounter {
    static int count = 0; // Static variable to count the number of objects

    public ObjectCounter() {
        count++; // Increment count each time an object is created
    }

    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        System.out.println("Number of objects created: " + count);
    }
}
