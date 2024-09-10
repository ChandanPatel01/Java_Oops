import java.io.*;
class ReaderOutput{
    public static void main(String[] args)  throws IOException,FileNotFoundException{
        BufferedReader bufferedReader=new BufferedReader(new FileReader("Tab.txt"));
        int data=bufferedReader.read();
        while (data!=-1) {
            System.out.print((char)data);
            data=bufferedReader.read();
        }
        bufferedReader.close();

    }
}