package coonstructor_init;
class A{
    {
	      System.out.println("Hello");
	}
	  A(){
		  super();
	    System.out.println("I am A  Class");
	  }
}

class B extends A{
   {
    System.out.println("Hi");
   }
   B(){
	   super();
      System.out.println("I am B Class");
   }
      public static void main(String[]args){
	    B obj =new B();
	  }
}