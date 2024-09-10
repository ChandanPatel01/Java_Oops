import java.io.*;
public class Readline{
   
    public static void main(String[] args)  throws IOException,FileNotFoundException{
        int count=0;
        BufferedReader bufferedReader=new BufferedReader(new FileReader("Tab.txt"));
        String data=bufferedReader.readLine();
        while (data!=null) {
            System.out.print(data);
            System.out.println("");
            data=bufferedReader.readLine();
            count ++;
        }
        bufferedReader.close();
        System.out.println("Loop is Executeed >"+ count);

    }
}