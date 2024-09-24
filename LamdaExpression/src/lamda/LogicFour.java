package lamda;

interface I4{
	String m1();
}


public class LogicFour {

	public static void main(String[] args) {
		I4 obj =() -> {return "Chandan Patel1";};
		System.out.println(obj.m1());

	}

}
