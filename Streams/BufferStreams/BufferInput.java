import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
public class BufferInput {
    public static void main(String[] args) throws IOException ,FileNotFoundException{

        
        BufferedInputStream bufferedInputStream =new BufferedInputStream(new FileInputStream("Show.txt"));
       
       int data=bufferedInputStream.read();
       while(data!=-1){
        System.out.print((char)data);
        data= bufferedInputStream.read();

       }
       bufferedInputStream.close();

    
    }
    
}
