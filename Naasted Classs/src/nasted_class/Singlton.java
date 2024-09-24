package nasted_class;

 class Singltons {
    private static Singltons sing;
    private Singltons() {}
    public void M1() {
    	System.out.println("Hello");
    }
    public static Singltons  getSingltonsObject() {
		if(sing==null) {
			sing=new Singltons();
		}
		return sing;
	}
    
}
public class Singlton{
	public static void main(String[]args) {
		Singltons obj1= Singltons.getSingltonsObject();
		Singltons obj2= Singltons.getSingltonsObject();
		Singltons obj3= Singltons.getSingltonsObject();
		
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
	
}
