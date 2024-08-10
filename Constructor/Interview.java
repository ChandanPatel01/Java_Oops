package init_chaining;
class Interview{
  {
      System .out.println("I am Interview Questions");
  }
  
     Interview(){
	 this('a');
	 System .out.println("A");
	 }
	 
	 Interview(Double d){
	    System .out.println("B"); 
	 }
	 
	 Interview(Character c){
	    this(12.99);
	    System .out.println("C");
	 
	 }
	 
	 public static void main(String[]args){
	    Interview it=new Interview();
		////////////BCA
	 }
}