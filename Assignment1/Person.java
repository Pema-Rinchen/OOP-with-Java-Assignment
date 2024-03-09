public class Person {
    // Class variable
    private static int totalPersons = 0;
    
    // Instance variables
    private String name;
    private int age;
    private String occupation;
    
    // Constructor
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        totalPersons++;
    }
    
    // Method to display details of a person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println();
    }
    
    // Method to display total number of persons
    public static void displayTotalPersons() {
        System.out.println("Total Persons: " + totalPersons);
    }
    
    // Main method to create instances and demonstrate the class
    public static void main(String[] args) {
        // Creating instances of the Person class
        Person person1 = new Person("Alice", 30, "Software Engineer");
        Person person2 = new Person("Bob", 45, "Doctor");
        Person person3 = new Person("Charlie", 25, "Teacher");

        // Displaying details of each person
        person1.displayDetails();
        person2.displayDetails();
        person3.displayDetails();

        // Displaying total number of persons
        Person.displayTotalPersons();
    }
}
