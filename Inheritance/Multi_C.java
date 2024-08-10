package multi;
class Multi_A{
	int a,b,c;
    void sum(){
	        a=12; 
		    b=14;
		    c=a+b;
		   System.out.println("I am Parent Class Sum:"+c);
		  
	      }
}
class Multi_B extends Multi_A{ 
    void sub(){
	       c=a-b;
	    System.out.println("I am Parent Class Sub:"+ c);
	      }
}


	class Multi_C extends Multi_B{
	          void display(){
			    this.sum();
				this.sub();
			  }
	   public static void main(String[]args){
	    System.out.println("I am Sub Class");
	    Multi_C s=new Multi_C();
		s.display();
	   }
	

}