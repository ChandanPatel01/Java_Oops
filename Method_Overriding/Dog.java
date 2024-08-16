package method_hiding;
class Animal {
     static void sound() {
	
        System.out.println("Animal is making a sound");
    }
}


public class Dog  extends Animal {
     static void sound(){
		
	    System.out.println("Dog is  Barking");
	 }

    public static void main(String[] args) {
       
		Animal.sound();
		Dog.sound();
       
    }
}