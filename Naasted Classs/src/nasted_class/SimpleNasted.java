package nasted_class;

public class SimpleNasted {
	 private int x=600;
     void display() {
    	 A obj=new A();
    	 obj.show();
     }
     
     class A{
    	 void show() {
    		 System.out.println("Hello :" + x);
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleNasted sn=new SimpleNasted();
		sn.display();
        
	}

}
