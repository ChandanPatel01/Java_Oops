class Mix{
    private Mix(){}
    void m1(){
        System.out.println("Hello I am Factory Object");
    }
    public static Mix createMix(){
        return new Mix();
}
}

public class FactroyObject {
     public static void main(String[] args) {
        Mix mix = Mix.createMix();
        mix.m1();
     }
     
}
