import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
public class WriterOutput {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        Scanner input = new Scanner(System.in);
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("Tab.txt"));
        System.out.println("Enter the number of rows");
        String data= input.nextLine();
        bufferedWriter.write(data);
        bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println("Svaed!");


        

    }
    
}
