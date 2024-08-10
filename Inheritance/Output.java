package single;
class Single{
    void display(){
	    System.out.println("I am Parent Class");
	      }
}
	class Output extends Single{
	   public static void main(String[]args){
	    System.out.println("I am Sub Class");
	    Output s=new Output();
		s.display();
	   }
	

}