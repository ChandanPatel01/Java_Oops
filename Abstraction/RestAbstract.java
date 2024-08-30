abstract class RestAbstract {
    abstract void car();
    abstract void model();
    abstract void type();

    void compeny(){
        System.out.println("Company: Toyota");
    }
}
 abstract class Shoroom extends RestAbstract{
    public void car(){
        System.err.println(" Car :Foortuner");
    }

    // public void model(){
    //     System.err.println("Foortuner");
    // }

    // public void type(){
    //     System.err.println("Foortuner");
    // }

    public static void main(String[] args) {
        RestAbstract ra=new Shoroom(){
            // Anonymous class Declarration
            public void model(){}
            public void type(){}
        };
        ra.car();
        ra.compeny();
    }
 }
