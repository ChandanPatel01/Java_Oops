package nasted_class;
interface Vichels{
	void carName();
	void carModel();
	void carNumber();
}
abstract class Tata implements Vichels{
	public void carName() {};
	public void carModel() {};
	public void carNumber() {
		System.out.println("CAR NUMBER: DL 09 CB 8745");
	};
}
class Car extends Tata{
	@Override
	public void carName(){
		System.out.println("CAR NAME : TATA PUNCH");
	}
	@Override
	public void carModel() {
		System.out.println("CAR MODEL :TATA PUNCH 2023");
	}
	
}


public class AdaptorExample {
    public static void main(String[]args) {
    	Car c=new Car();
    	c.carName();
    	c.carNumber();
    	c.carModel();
    }
}
