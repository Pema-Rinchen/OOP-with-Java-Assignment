public class Member {
    // Private data members
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    // Constructor
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: $" + salary);
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// Employee class inheriting from Member
public class Employee extends Member {
    private String specialization;

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

// Manager class inheriting from Member
public class Manager extends Member {
    private String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("John Doe", 25, "123-456-7890", "123 Main St", 50000, "Software Developer");
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Phone Number: " + employee.getPhoneNumber());
        System.out.println("Address: " + employee.getAddress());
        employee.printSalary();
        System.out.println("Specialization: " + employee.getSpecialization());
        System.out.println();

        // Creating a Manager object
        Manager manager = new Manager("Jane Smith", 35, "987-654-3210", "456 Oak Ave", 80000, "IT");
        System.out.println("Manager Information:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Age: " + manager.getAge());
        System.out.println("Phone Number: " + manager.getPhoneNumber());
        System.out.println("Address: " + manager.getAddress());
        manager.printSalary();
        System.out.println("Department: " + manager.getDepartment());
    }
}
