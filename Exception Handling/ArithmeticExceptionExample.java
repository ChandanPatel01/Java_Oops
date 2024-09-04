import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first number:");
            Integer num = sc.nextInt();
            System.out.println("Enter second number:");
            Integer num1 = sc.nextInt();

            // Perform division
            Integer res = num / num1;
            System.out.println("Result: " + res);
        } catch (Exception e) {
            // Using instanceof to check the type of exception
            if (e instanceof ArithmeticException) {
                System.out.println("Can't divide by zero.");
            } else if (e instanceof InputMismatchException) {
                System.out.println("Invalid input. Please enter numeric values.");
            } else {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        } finally {
            System.out.println("All is well. Code execution complete.");
        }
    }
}
