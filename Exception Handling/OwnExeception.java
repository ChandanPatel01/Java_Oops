import java.util.Scanner;

class OwnSalException extends RuntimeException {  // Custom exception class banayi
   
    public String toString() {  // toString method ko override kiya
        return "Salary must be Positive!";  // Error message diya jo show hoga jab exception throw hoga
    
}
}

class Test {  // Yeh class employee ka data input lene aur show karne ke liye hai
    Scanner sc = new Scanner(System.in);  // Scanner object input lene ke liye
    Integer empId;  // Employee ID ko store karega
    String empName;  // Employee Name ko store karega
    double empSal;  // Employee Salary ko store karega

    void accept() {  // Employee ka data input lene ka method
        System.out.print("Enter Employee Id:");
        empId = sc.nextInt();
    
        empName = sc.nextLine();
        System.out.print("Enter Employee Name:");
        empName = sc.nextLine();
        System.out.print("Enter Employee Salary:");
        empSal = sc.nextDouble();
    

        if (empSal < 0) {  // Agar salary negative hui
             OwnSalException cse= new OwnSalException();  // Toh custom exception throw karo
             throw cse;  
        }

        display();  // Agar sab sahi hai toh data display karo
    }

    void display() {  // Employee ka data display karne ka method
        System.out.println("Employee Id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee Salary : " + empSal);
    }
}

public class OwnExeception {  // Main class jahan program start hota hai
    public static void main(String[] args) {
        try {
            new Test().accept();  // Test class ka object banakar accept method call kiya
        } catch (OwnSalException e) {  // Agar custom exception throw hota hai toh use catch karo
            System.out.println(e);  // Exception ka message print karo
        }
        finally{

        System.out.println("All is well!");  // Finally statement jo hamesha print hogi
        }
    }
}
