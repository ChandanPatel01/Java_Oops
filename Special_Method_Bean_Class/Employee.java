package bean;

public class Employee {
    private Integer empNo;
    private String empName;
    private Double empSal;
    
    // Constructor using the this keyword
    public Employee(Integer empNo, String empName, Double empSal) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSal = empSal;
    }
    
    // Getter methods to read the values
    public Integer getEmpNo() {
        return this.empNo;
    }
    
    public String getEmpName() {
        return this.empName;
    }
    
    public Double getEmpSal() {
        return this.empSal;
}
}






