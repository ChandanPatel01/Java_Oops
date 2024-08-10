package object_creation;
import java.util.Scanner;
class Student_Data {
    private Integer rollno;
    private String name;
    private static String code;  // Static variable to hold college code

    // Static block to initialize the college code
    static {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your College Code: ");
        code = sc.next();
    }

    // Constructor
    Student_Data(Integer rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // Method to display student details
    void display() {
        System.out.println("Your Roll No: " + rollno);
        System.out.println("Your Name: " + name);
        System.out.println("Your College Code: " + code);
    }
}

public class College {
    public static void main(String[] args) {
        Student_Data sd = new Student_Data(101, "Sumit");
        sd.display();  // Calling the display method to show student details
    }
}
