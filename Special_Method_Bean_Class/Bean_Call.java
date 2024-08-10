package bean_call;
import bean.Employee;

public class Bean_Call {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Chandan", 100009.32);
        
        System.out.println("Employee No: " + employee.getEmpNo());
        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Employee Salary: " + employee.getEmpSal());
    }
}