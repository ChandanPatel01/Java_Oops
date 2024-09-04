public class ArrayoutofBound {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            int value = numbers[-3];  // Invalid index, should be 0 to 4
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e);
        }
    }
}
