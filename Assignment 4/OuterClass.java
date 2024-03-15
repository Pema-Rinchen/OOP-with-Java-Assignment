public class OuterClass {
    private int outerVariable = 10;

    // Inner class definition
    class InnerClass {
        void displayOuterVariable() {
            System.out.println("Value of outerVariable: " + outerVariable);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass outerObj = new OuterClass();

        // Create an instance of the inner class
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();

        // Call a method of the inner class to display the outer variable
        innerObj.displayOuterVariable();
    }
}
