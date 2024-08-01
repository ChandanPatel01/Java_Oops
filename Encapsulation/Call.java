package encapsulation1;
import encapsulation.Person; // import package
public class Call{
   public static void main(String[]args){
   // call and object Creation
    Person p1=new Person();
	p1.setEmpName("Chandan");   // Actual Argument 
	p1.setEmpId(101);
	p1.setEmpSallary(36251.89);
	
	//  Print the outou by getterMethod
	  System.out.println(p1.getEmpName());
	  System.out.println(p1.getEmpId());
	  System.out.println(p1.getEmpSallary());
	  
	  
   }
}