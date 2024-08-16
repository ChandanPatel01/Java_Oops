package chain;
class G extends Object{
    G(int x){
	     System.out.println("GrandFather");
	}
}
class P extends G{
    P(int x){
		super(100);
	 System.out.println("Parent");  
	}
}
class C extends P{
    C(int x){
		super(200);
	 System.out.println("Child Class");  
	}
	public static void main(String[]args){
	        C obj=new C(300);
	}
}