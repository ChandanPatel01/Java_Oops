class Dummy{
    public static void main(String[]args){
	       System.out.println("Hello");
	}
}
class Call{
       public static void main(String[]args){
	     Dummy.main(new String[0]);
		 System.out.println("hellllllll");
		
	}
}