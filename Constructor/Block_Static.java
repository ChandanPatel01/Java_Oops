package static_block;

class Block_Static {
    static int a; // Declare static variable a
    static int b; // Declare static variable b

    // Static block to initialize static variables
    static {
        a = 50;
        b = 30;
    }

    // Default constructor
    Block_Static() {
        int c = a + b;
        System.out.println("Addition: " + c);
    }

    // Constructor with one parameter
    Block_Static(int a) {
        int c = a - b;
        System.out.println("Subtraction: " + c);
    }

    // Constructor with one parameter (should be a different parameter than previous one)
    Block_Static(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication: " + c);
    }

    public static void main(String[] args) {
        Block_Static bs = new Block_Static();           // Calls default constructor
        Block_Static bs1 = new Block_Static(50);       // Calls constructor with one parameter
        Block_Static bs2 = new Block_Static(50, 30);     // Calls constructor with two parameters
    }
}
