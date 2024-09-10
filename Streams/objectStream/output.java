import java.io.Serializable;
import java.io.OutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class output implements Serializable {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // File output stream to save the Employee object to Emp.txt
        OutputStream outputStream = new FileOutputStream("Emp.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // Creating Employee object
        Employee employee = new Employee(102, "Satvik", 458555);

        // Corrected: Writing the Employee object instead of ObjectOutputStream
        objectOutputStream.writeObject(employee);

        // Flushing and closing the output stream
        objectOutputStream.flush();
        objectOutputStream.close();

        System.out.println("Employee object has been serialized and saved in Emp.txt");
    }
}
