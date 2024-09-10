import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // File input stream to read from Emp.txt
        InputStream inputStream = new FileInputStream("Emp.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        // Deserializing the Employee object
        Employee employee = (Employee) objectInputStream.readObject();

        // Closing the stream
        objectInputStream.close();

        // Printing the Employee object details
        System.out.println("Employee ID: " + employee.getEmpId());
        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Employee Salary: " + employee.getEmpSal());
    }
}
