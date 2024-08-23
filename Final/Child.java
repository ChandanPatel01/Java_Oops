package finals;
class Papa{
     final void marry(){
	    System.out.println("Papa Choice ");
		int a=50;
		int b=40;
		int c=a+b;
		System.out.println("Papa Choice " +c);
	  }
}
class Child extends Papa{
	 void marry(){
		System.out.println("Papa nhi Manenge Yarr:" );  
	  }
	
    public static void main(String[]args){
	    Child child=new Child();
		child.marry();
	}
} 
// ye inherit ho rha hai 