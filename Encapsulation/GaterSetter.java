class GatterSetter{
    private Integer empId;
    private String empName;
    private Integer empSal;


public void setEmpID(Integer empId){
    this.empId=empId;
}
public void setEmpName(String empName){
    this.empName=empName;
}
public void setEmpSal(Integer empSal){
    this.empSal=empSal;
}
public Integer getEmpId(){
       return empId;
}
public String getEmpName(){
    return empName;
}
public Integer getEmpSal(){
    return empSal;
}
}