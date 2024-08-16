package special;

class Grand extends Object{
    Grand() {
        System.out.println("Hello I am Grand Class");
    }
}

class Parent extends Grand {
    Parent() {
        // Call the constructor of the parent class (Grand)
        super();
        System.out.println("Hello I came from Grand Class into Parent Class");
    }
}

class Child extends Parent {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
