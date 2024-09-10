import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
    public static void main(String[] args) {
        try {
            // FileWriter ka object banate hain jo file me likhega
            FileWriter fileWriter = new FileWriter("output.txt");
            
            // BufferedWriter ka use karte hain, jo data ko buffer me store karke likhne me madad karta hai
            BufferedWriter writer = new BufferedWriter(fileWriter);
            
            // Data ko file me write kar rahe hain
            writer.write("Hello, Writer!");
           
            writer.write("This is written using BufferedWriter.");
       
            writer.write("2024");
        
            writer.write(String.valueOf(45.67));  // Float ko string me convert karke likha jaata hai
            
            // BufferedWriter ko flush karte hain takki data file me save ho jaye
            writer.flush();
            
            // Writer ko close karte hain
            writer.close();
        } catch (IOException e) {
            // Agar koi exception aati hai, toh yeh block handle karega
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
