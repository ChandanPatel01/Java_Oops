package bean_call;
import bean.Employee;
public class Bean_Call{
   public static void main(String args[]){
      Employee employee = new Employee(101,"Chnadan",100009.32);
	  
	  System .out .println(employee.getEmpNo());
	  System .out .println(employee.getEmpName());
	  System .out .println(employee.getEmpSal());
	  
	   
       
   }
}
