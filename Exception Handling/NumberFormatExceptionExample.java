import java.util.Scanner;

public class NumberFormatExceptionExample {  // Renamed the class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = sc.next();

        try {
            Integer n = Integer.parseInt(num);  // Tries to convert string to number
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e);
        }
        System.out.println("All is well");
    }
}
