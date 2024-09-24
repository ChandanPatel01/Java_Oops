package nasted_class;

public interface I1 {
      void show();
      void display();
      
}
 class Dummy{
	 public static void main(String[]args) {
		 I1 obj=new I1() {
			 public void show(){
				 System.out.println("Hello");
			 }
			 public void display() {
				 System.out.print("Hey!");
			 }
		 };
		 obj.display();
		 obj.show();
	 }
	 
 }
