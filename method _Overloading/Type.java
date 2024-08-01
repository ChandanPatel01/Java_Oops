// Type of Parameter should be Difftrent
package type;
public class Type{
   public void display(Integer x){
	   System.out.println("I am Integer Value:" +x);
	}
	private static void display(String x){
	   System.out.println("I am String Value:" +x);
	}
	public static void main(String[]args){
	    Type type=new Type();
		type.display(101);
		Type.display("Chnadan");
}
}
