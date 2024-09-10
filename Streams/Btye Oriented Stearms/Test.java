import java.io.*;
public class Test {
    public static void main(String[]aergs)  throws FileNotFoundException,IOException{
         InputStream inputStream=new FileInputStream("Test.java");
         int data=inputStream.read();
         while(data!=-1){
            System.out.print((char)data);
            data=inputStream.read();
         }
         
         inputStream.close();

    }
}