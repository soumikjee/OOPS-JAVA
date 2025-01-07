public class Person {
    private String name; // Instance variable
    private int age;     // Instance variable

    // Constructor
    public Person(String name, int age) {
        this.name = name; // 'this' refers to the instance variable
        this.age = age;   // 'this' refers to the instance variable
    }

    // Method to display details
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        Person per = new Person("Alice", 30); // Create an object
        per.display(); // Display the details
    }
}
