import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;  //  File operations ke dauran agar koi input/output error aata hai toh ye exception handle karta hai.
import java.io.FileNotFoundException;
public class InputStreamLong {
    public static void main(String[] args) {
        try{
        InputStream inputStream=new FileInputStream("Display.txt");
        int data=inputStream.read();
        while (data!=-1) {
            System.out.print(data);
            data=  inputStream.read();
        }
        
        
        inputStream.close();
        }
        catch(FileNotFoundException e){
                 e.getStackTrace();
        }
        catch(IOException e){
             e.getStackTrace();
        }
        finally{
            
        }



    }
    
}
