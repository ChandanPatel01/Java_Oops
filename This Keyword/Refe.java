public class Refe {
    int x=100;
    static int y=20;

    void m2(){
        System.out.println(this.x);
        System.out.println(this);
    }
    public static void main(String[] args) {
        Refe r=new Refe();
        r.m2();
        System.out.println(r.x);
        System.out.println(Refe.y);
    }
    
}
