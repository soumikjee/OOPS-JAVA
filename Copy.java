public class Copy {
    int a, b, x, y;

    // Default constructor
    public Copy() {
        a = 10;
        b = 20;
        System.out.println("Sum in default constructor: " + (a + b));
    }

    // Copy constructor
    public Copy(Copy obj) {
        x = obj.a;
        y = obj.b;
        System.out.println("Sum in copy constructor: " + (x + y));
    }

    public static void main(String[] args) {
        Copy ref1 = new Copy(); // Calls the default constructor
        Copy ref2 = new Copy(ref1); // Calls the copy constructor
    }
}
