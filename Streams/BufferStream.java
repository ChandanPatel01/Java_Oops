import java.io.*;
public class BufferStream {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        OutputStream outputStream =new FileOutputStream("Show.txt");
        BufferedOutputStream bos=new BufferedOutputStream(outputStream);
        String data="Hello";
        byte arr[]=data.getBytes();
        bos.flush();
        bos.write(arr);
        bos.close();
        System.out.println("Saved");

    }
}
