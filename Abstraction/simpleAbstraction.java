abstract class simpleAbstract{
    abstract void car();
}
class simpleClass extends simpleAbstract{
 void car(){
    System.out.println("I am a car");

    }
    public static void main(String[] args) {
        simpleAbstract sa=new simpleClass();
        sa.car();
    }
}