package encapsulation;
 public class Person{
    // for input Setter
	private String empName;
	private Integer empId;
	private Double empSallary;
   public void setEmpName(String empname){
        empName=empname;
   }
   public void setEmpId(Integer id){
        empId=id;
   }
    public void setEmpSallary(Double sal){
	   empSallary=sal;
	}
	
	// for output getter
	
	public String getEmpName(){
	    return empName;
	}
	
	public Integer getEmpId(){
	    return empId;
	}
	
	public Double getEmpSallary(){
	    return empSallary;
	}
}










