public class Default {

    int x; // Instance/non static  variable

    // Constructor
    Default() { // Default constructor
        x = 10;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Default ref = new Default(); // Create an instance of Default

        // Directly accessing instance variable 'x'
        ref.x = 20;
        System.out.println(ref.x);
    }
}
