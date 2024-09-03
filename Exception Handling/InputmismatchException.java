import java.util.InputMismatchException;
import java.util.Scanner;

public class InputmismatchException {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No:");
        Integer a=sc.nextInt();
        System.out.print("Enter No:");
        Integer b=sc.nextInt();

        
            Integer c=a-b;
            System.out.println("Subtraction of two numbers is: "+c);
        } 
        catch (InputMismatchException e) {
            System.out.println("Exception caught: " + e);
            // TODO: handle exception
        }
        System.out.println("All is well");
    }
}
