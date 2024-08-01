class Test{
 void m1(){
    System.out.println("hello");
 }
 void m2(){
   System.out.println("hi");
    System.out.println(this);
	this.m1();
 }
 public static void main(String[]args){
        Test test=new Test();
		 System.out.println(test);
		 test.m2();
		 
 }
}