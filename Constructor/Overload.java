package c_overload;

class Overload {
    Overload() {
        super();
        System.out.println("Hello");
    }
    
    Overload(int x) {
        super();
        System.out.println("Hello: " + x);
    }
    
    public static void main(String[] args) {
        Overload ol = new Overload(100);
    }
}