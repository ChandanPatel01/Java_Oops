import java .io.*;
public class ReaderShort {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        Reader reader=new FileReader("Output.txt");
        int data=reader.read();
        while(data!=-1){
            System.out.print((char)data);
            data=reader.read();
        }
        reader.read();
        
    }
    
}
