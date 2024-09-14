import java.io.*;
class Test {
    public static void main(String[]aergs)  throws FileNotFoundException,IOException{
         InputStream inputStream=new FileInputStream("Massage.txt");
         int data=inputStream.read();
         while(data!=-1){
            System.out.print((char)data);
            data=inputStream.read();
         }
         
         inputStream.close();

    }
}