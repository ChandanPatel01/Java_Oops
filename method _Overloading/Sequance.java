// Sequance of Parameter should be Difftrent
package sequance;
public class Sequance{
   public void display(Integer x, String s){
	   System.out.println("I am Integer Value:" +x);
	   System.out.println("I am String Value:" +s);
	}
	private static void display(String s , Integer x){
	   System.out.println("I am String Value:" +s);
	   System.out.println("I am Integer Value:" +x);
	}
	public static void main(String[]args){
	   Sequance squ=new Sequance();
		squ.display(101,"CHANDAN");
		System.out.println();
		squ.display("Chnadan",102);
}
}
