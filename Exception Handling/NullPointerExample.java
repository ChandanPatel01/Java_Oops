public class NullPointerExample {
    public static void main(String[] args) {
        String name=null;
        try {
            // Attempt to call a method on a null object
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException"+e);
        }
        finally{
        
        System.out.println("Program continues...");
    }
    }
}
