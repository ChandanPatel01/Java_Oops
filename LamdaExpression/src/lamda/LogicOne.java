package lamda;
interface I1{
	void m1();
}
public class LogicOne {
    public static void main(String[]args) {
    	I1 obj=()->
    		System.out.println("Hello");
    		obj.m1();
    	}
    }

