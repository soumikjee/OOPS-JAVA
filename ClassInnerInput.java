import java.util.Scanner;

public class ClassInnerInput {

    // Creating a new datatype
    public static class Student {
        String name;
        int rollno;
        double percentage;
        int age;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student sd = new Student(); // create a new object

        // Input student details
        System.out.print("Enter Student name : ");
        sd.name = sc.nextLine();

        System.out.print("Enter Student roll number : ");
        sd.rollno = sc.nextInt();

        System.out.print("Enter Student percentage % : ");
        sd.percentage = sc.nextDouble();

        System.out.print("Enter Student age : ");
        sd.age = sc.nextInt();

        // Display student details
        System.out.println("\nStudent Details :"); 
        System.out.println("Name: " + sd.name);
        System.out.println("Roll Number: " + sd.rollno);
        System.out.println("Percentage: " + sd.percentage);
        System.out.println("Age: " + sd.age);

        sc.close(); // Close the scanner
    }
}
