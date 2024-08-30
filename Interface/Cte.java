interface Tcs{
	void m1();
}
interface Hcl{
	void m2();
}
  class Dummy implements Tcs,Hcl{
	    //@override
	public void m1(){
		
		System.out.println("Hello");
	}
    public void m2(){
		
		System.out.println("Hello");
	}
	// main method
	public static void main(String[]args){
		Tcs e=new Dummy();
		e.m1();
		
		Hcl e1=new Dummy();
		e1.m2();
	}
}