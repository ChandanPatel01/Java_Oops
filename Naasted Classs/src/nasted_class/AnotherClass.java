package nasted_class;

public class AnotherClass {
        private int x=500;
        class A{
        	 void show(){
        		System.out.println("Hello: "+ x);
        	}
        }
}
class Demo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	 AnotherClass t=new AnotherClass();
         AnotherClass.A a=new AnotherClass().new A();
         AnotherClass.A a1=t.new A();
         a1.show();
	}

}
