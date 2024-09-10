import java.io.*;
public class photoReader {
 public static void main(String[] args) throws IOException ,FileNotFoundException {
      InputStream inputStream =new FileInputStream("a.JPG");
      OutputStream outputStream = new FileOutputStream("pic.JPG");
      int data=inputStream.read();
      while (data != -1) {
        outputStream.write(data);
        data=inputStream.read();
        
      }
      System.out.println("Saved");
      inputStream.close();
 }
    
}
