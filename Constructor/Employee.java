class Employee {
    private Integer empId;
    private String empName;
    private Double empSal;

    // Constructor
    Employee(Integer empId, String empName, Double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    // Getter methods
    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Double getEmpSal() {
        return empSal;
    }
}
