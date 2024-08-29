interface I1{
   void m1();
}
class Test implements I1{
    public void m1(){
	System.out.println("First Example");
	}
	
	public static void main(String[]rgs){
	     I1 obj=new Test();
		 obj.m1();
	}
}