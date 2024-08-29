interface Tcs{
	void m1();
}
interface Hcl extends Tcs{
	void m2();
}
  class Ducat implements Hcl {
	
	public void m1(){
		System.out.println("Rajeev");
	}
	public void m2(){
		System.out.println("Harish");
	}
	// main method
	public static void main(String[]args){
		Hcl e =new Ducat();
		e.m1();
		e.m2();
	}
}