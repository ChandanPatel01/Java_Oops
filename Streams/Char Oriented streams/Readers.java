import java.io.Reader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Readers {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("Demo.txt");
            int data=reader.read();
            while (data!=-1) {
                System.out.print((char) data);
                data=reader.read();
            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            e.getMessage();

        }
    }

    
}
