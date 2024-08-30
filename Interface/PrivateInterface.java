interface PrivateInterface {
    // Private method in interface
    private void sum() {
        System.out.println("sum Method");
    }

    // Default method in interface to access private method
    default  void callSum() {
        sum(); // Calling private method from within the interface
    }
}

class Test implements PrivateInterface {
    public static void main(String[] args) {
        Test t = new Test();
        t.callSum(); // Calling default method which in turn calls the private method
    }
}
