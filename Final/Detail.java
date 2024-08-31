public class Detail {
    private static final int rollNO;
    private static final  String name;

    static{
        rollNO = 1;
        name = "John";

    }
    void display(){
        System.out.println("Roll No: "+rollNO +" Nmae: "+ name);
    }
    
    public static void main(String[] args) {
    Detail d=new Detail();
    d.display();

        
    }
}
