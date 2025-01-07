public class ClassInner{

    // creating a new datatype
    public static class Student{

        String name;
        int rollno;
        double percentage;
        int age;

    }

    public static void main(String[]args){

        Student sd = new Student();

        sd.name = "Soumik";
        sd.rollno =19;
        sd.percentage=97.08;
        sd.age=22;

        System.out.println("Name : "+ sd.name);  // Soumik
        System.out.println("Roll no : "+ sd.rollno);  // 19
        System.out.println("Percentage : "+ sd.percentage);  // 97.08
        System.out.println("Age : "+ sd.age);  // 22

    }
}