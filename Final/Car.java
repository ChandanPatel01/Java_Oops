package inherit;
class BMW{
   final void feature(){
      System.out.println("MY SPEED 300 KM/H");
	  System.out.println("ALL AUTOMATIC SYSTEM");
   }
}
class Car extends BMW{
   public final static void main(String[]args){
    Car car=new Car();
	    car.feature();
		 System.out.println("middle");
		 Audi ad=new Audi();
		 ad.m1();
   }
}
class Audi extends Car{
	final void m1(){
	 System.out.println("ALL AUTOMATIC SYSTEM");
	}
}