import java.util.Scanner;
public class AirthmaticException {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter No");
    Integer num=sc.nextInt();
    System.out.println("Enter No");
    Integer num1= sc.nextInt();

    try{
        Integer res=num/num1;
        System.out.println("Result:"+ res);
    }
    catch(Exception e){
          System.out.println("Zero not devisible   ||"  +e );
    }
      
    System.out.println("All is well Code Compiler");


  }
}
