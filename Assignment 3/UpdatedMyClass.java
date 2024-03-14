public class UpdatedMyClass {
    private int value;

    // Default constructor
    public MyClass() {
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    public MyClass(int value) {
        this.value = value;
        System.out.println("Parameterized constructor called with value: " + value);
    }

    // Copy constructor
    public MyClass(MyClass other) {
        this.value = other.value;
        System.out.println("Copy constructor called with value: " + value);
    }

    public static void main(String[] args) {
        // Creating instances using different constructors
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(10);
        
        // Creating a copy of obj2 using copy constructor
        MyClass obj3 = new MyClass(obj2);
    }
}
