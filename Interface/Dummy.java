interface Tcs{
	void m1();
}
interface Hcl{
	void m1();
}
  class Dummy implements Tcs,Hcl{
	    //@override
	public void m1(){
		
		System.out.println("Hello");
	}
	// main method
	public static void main(String[]args){
		Tcs e=new Dummy();
		e.m1();
		
		Tcs e1=new Dummy();
		e1.m1();
	}
}