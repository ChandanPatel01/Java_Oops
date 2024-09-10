import java.io.Serializable;

public class Employee implements Serializable {
    //private static final long serialVersionUID = 1L;  // Recommended for serialization compatibility

    private Integer empId;
    private String empName;
    private Integer empSal;

    public Employee(Integer empId, String empName, Integer empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Integer getEmpSal() {
        return empSal;
    }
}
