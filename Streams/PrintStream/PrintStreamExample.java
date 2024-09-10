import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.FileInputStream;

public class PrintStreamExample  {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        // PrintStream object banaya jo console pe print karega (System.out se)
        PrintStream ps = new PrintStream(new FileOutputStream("PrintStreamExample.java"));
        
        // Strings, integers, aur other types ko print kar rahe hain
        ps.println("Hello, Hello ");  // String print karega
        ps.println(2024);                    // Integer print karega
        ps.println(45.67);                   // Float print karega
        ps.println(true);                    // Boolean print karega

        // PrintStream ko manually flush kar rahe hain
        ps.flush();

        // PrintStream ko close karna zaroori hai jab file ya other stream use karte ho
        ps.close(); // Console ke liye optional hai, lekin habit acchi hai.
    }
}
