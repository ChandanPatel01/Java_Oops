package shadow;
class Students{
    private Integer rollNo;
	public void setRollNo( Integer rollNo){
	   this.rollNo=rollNo;
	}
	public Integer getRollNo(){
	        return rollNo;
	}
}
public class Output{
   public static void main(String[]args){
      Students sc=new Students();
	  sc.setRollNo(420);
	  System.out.println("This is Roll Number:"+sc.getRollNo());
   }
}