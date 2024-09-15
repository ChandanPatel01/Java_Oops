public class TypePromotion {
    void m1(int x,double y){
        System.out.println("Hello");
    }
    void m1(int x,String y){
        System.out.println("HI");
    }

    public static void main(String[] args) {
        TypePromotion tp=new TypePromotion();
         tp.m1(5, 'D');
    }
}
