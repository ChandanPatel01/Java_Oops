//package compeny;
class Employee{
     Integer id;
	 String name;
	 Double sellary;   

    void insert(Integer i,String n,Double s ){
         id=i;
		 name=n;
		 sellary=s;
   }
   void display(){
   System.out.println("Employee_ID:"+id);
   System.out.println("Employee_Name:"+name);
   System.out.println("Employee_Sellary:"+sellary);
   }
}
   
   public class Access{
    public static void main(String[]args){
	 Employee emp1=new Employee();
	 Employee emp2=new Employee();
	 Employee emp3=new Employee();
	 
	    emp1.insert(101, "Karan", 47489.12);
		System.out.println();
        emp2.insert(102, "Sameer", 78989.77);
		System.out.println();
        emp3.insert(107, "Chetna", 54789.35);
	 
	emp1.display();  
	System.out.println();
    emp2.display();  
	System.out.println();
    emp3.display();  
	 
	}
   }