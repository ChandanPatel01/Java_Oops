package chain;
public class Chaining{
   Chaining(){
	   this("a");
        System.out.println(" I am beta");
   }
    Chaining(int a){
		this();
	    System.out.println(" I am Papa");
   }
    Chaining(String a){
			//this(100);
	     System.out.println(" I am Maa");
	}
	
	public static void main(String[]args){
	     Chaining cn=new Chaining(100);
	}
   
	}
