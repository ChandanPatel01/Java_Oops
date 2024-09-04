import java.util.Scanner;
public class AgeException extends RuntimeException {
public String toString(){
    return" Age must be 18+";
 }
}
class EVM{
    
    Scanner sc=new Scanner(System.in);
    Integer voterId;
    String name;
    Integer age;

    void voting(){
        System.out.print("Enter Your Voter ID :");
        voterId=sc.nextInt();
        name=sc.nextLine();

        System.out.print("Enter Your Name :");
        name=sc.nextLine();
        System.out.print("Enter Your Age :");
        age=sc.nextInt();

        if(age<=18){
            // Object 
            throw new AgeException();
        }
        display();
    }

    void display(){
        System.out.println("Voter ID: "+voterId);
        System.out.println("Your Name: "+name);
        System.out.println("Your Age :"+age);
        
    }

    public static void main(String[] args) {
        try {
            new EVM().voting();
        } catch (AgeException e) {
            System.out.println(e);
            
            
        }
        finally{
            System.out.println("Thank you for voting");
        }
    }

}
