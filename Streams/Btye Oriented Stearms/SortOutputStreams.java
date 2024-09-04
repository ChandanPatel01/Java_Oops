import java.io.*;
import java.util.Scanner;
public class SortOutputStreams  {
    public static void main(String[] args)  throws FileNotFoundException ,IOException {
        Scanner scanner =new Scanner(System.in); 
       
            OutputStream sortOutputStreams=new FileOutputStream("Display.txt");
            System.out.println("Enter the number of files you want to sort");
            String massage = scanner.nextLine();
            byte[] arr=massage.getBytes();
            sortOutputStreams.write(arr);
            sortOutputStreams.close();
            System.out.println("Saved File ");
            scanner.close();
            
            

        
    }
    
    
}

