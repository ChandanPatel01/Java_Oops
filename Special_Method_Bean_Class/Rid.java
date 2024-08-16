package rid;

class Grand {
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

class Rid extends Parent {
    public static void main(String[] args) {
        Rid rid = new Rid();
		System.out.println(rid.hashCode());
		System.out.println(rid.toString());
    }
}
