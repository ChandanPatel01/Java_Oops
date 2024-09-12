import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // File input stream to read from Emp.txt
        InputStream inputStream = new FileInputStream("Emp.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        // Deserializing the Employee object
        Employee employee = (Employee) objectInputStream.readObject();

        // Closing the stream
        objectInputStream.close();

        // FileWriter to write the output back to Emp.txt
        FileWriter fileWriter = new FileWriter("Emp.txt", true); // 'true' appends to the file
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Writing the Employee object details to the file
        bufferedWriter.write("Employee ID: " + employee.getEmpId() + "\n");
        bufferedWriter.write("Employee Name: " + employee.getEmpName() + "\n");
        bufferedWriter.write("Employee Salary: " + employee.getEmpSal() + "\n");

        // Closing the BufferedWriter
        bufferedWriter.close();

        System.out.println("Employee details written to Emp.txt");
    }
}
