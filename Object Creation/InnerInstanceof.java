
class Mix {
    void m1(){
        System.out.println("Hello I am Instance of Object");
    }
}

public class InnerInstanceof {
    public static void main(String[] args) {
        try {
            // Load the class using reflection
            Class c = Class.forName("Mix");
            
            // Create an instance using newInstance() method
            Mix mix = (Mix) c.newInstance();
            
            // Call method m1
            mix.m1();
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
        catch (InstantiationException e) {
            e.printStackTrace();
        } 
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
