import java.util.Scanner;
import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class WriterInput {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      try{
        Writer writer =new FileWriter("Demo.Text");
        System.out.println("Enter Massage ");
        String str = sc.nextLine();
        writer.write(str);
        System.out.println("Saved Massage");
        writer.close();
      }
      catch(FileNotFoundException e){
         e.getStackTrace();
      }
      catch(IOException e){
        e.getStackTrace();
      }
      finally{
        sc.close();
      }
    }
}
