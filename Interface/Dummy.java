interface Tcs{
	void m1();
}
interface Hcl{
	void m1();
}
  class Dummy implements I1,I2{
	 
	public void m1(){
		@override
		System.out.println("Rajeev");
	}
	// main method
	public static void main(String[]args){
		I1 e=new Dummy();
		e.m1();
		I2 e1=new Dummy();
		e1.m1();
	}
}