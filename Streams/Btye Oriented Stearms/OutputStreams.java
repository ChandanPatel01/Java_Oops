// Dta Ko Write Kr Rha hai

import java.util.Scanner;
import java.io.OutputStream;//bytes ko kisi file ya output device mein likh sakein.
import java.io.FileOutputStream; //Iska use file mein data write karne ke liye hota hai. Ye OutputStream ka ek subclass hai.
import java.io.IOException; //  File operations ke dauran agar koi input/output error aata hai toh ye exception handle karta hai.
import java.io.FileNotFoundException;  //Agar file nahi milti ya usme kuch galat hota hai, toh ye exception handle karta hai.

// ye code data ko write kr rha hai use of outstrams ans character me to bytes me chanage kia gya 

public class OutputStreams {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        try{
        OutputStream outputStream=new FileOutputStream("Massage.txt");
        System.out.println("Enter your massage");
        String massage=scanner.nextLine();
        byte[] arr=massage.getBytes(); // massage string ko byte array mein convert kar raha hai.
        outputStream.write(arr);
        outputStream.close();
        System.out.println("Massage saved");
        
        }
        catch(FileNotFoundException e){
            e.getStackTrace();
        }
        catch(IOException e){
            e.getStackTrace();
        }

        
    }

    
}