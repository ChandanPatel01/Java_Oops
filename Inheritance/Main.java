package hierarchicalInheritance;

// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Subclass 1
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Subclass 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog dog = new Dog();
        dog.eat();    // Inherited method
        dog.sleep();  // Inherited method
        dog.bark();   // Method specific to Dog

        System.out.println();  // Adding a line break

        // Creating an instance of Cat
        Cat cat = new Cat();
        cat.eat();    // Inherited method
        cat.sleep();  // Inherited method
        cat.meow();   // Method specific to Cat
    }
}
