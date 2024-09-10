import java.util.Scanner;
import java.io.*;
public class WriterInputShort {
    public static void main(String[] args) throws IOException ,FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        Writer writer=new FileWriter("Output.txt");
        System.out.println("Enter your Massage");
        String str = sc.nextLine();
        writer.write(str);
        System.out.println("Saved Massage");
        writer.close();
      }
    
}
