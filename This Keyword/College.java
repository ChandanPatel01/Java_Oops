package object_creation;
import java.util.Scanner;
class Student_Data {
    private Integer rollno;
    private String name;
    private static String code;  // Static variable to hold college code

    // Static block to initialize the college code
    static {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your College Code: ");
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
        Student_Data sd1 = new Student_Data(101, "Sumit");
		Student_Data sd2 = new Student_Data(102, "Rabit");
		Student_Data sd3 = new Student_Data(103, "Honey");
		Student_Data sd4 = new Student_Data(104, "Sunny");
		Student_Data sd5 = new Student_Data(105, "Alex");
        sd1.display(); 
		System.out.println();
		 sd2.display(); 
		  System.out.println();
		 sd3.display(); 
           System.out.println();		  
		 sd4.display(); 
           System.out.println();		  
		 sd5.display(); 
    }
}
