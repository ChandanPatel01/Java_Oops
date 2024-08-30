abstract class abstractConstrutor {
    String name;
    int age;
    abstractConstrutor( String name, int age){
        this.name=name;
        this.age=age;
    }

    abstract void collage();

    void code(){
        System.out.println("I am coding");
    }
    
}
 class Department extends abstractConstrutor{

    Department(String name, int age) {
        super(name, age);
        System.out.println("Name: "+name+" Age: "+age);

    }
    public void collage(){
        System.out.println("I am in collage");
    }

    public static void main(String[] args) {
        abstractConstrutor ac=new Department("Hurry",12) ;
            ac.code();
            ac.collage();
            
    }

 }
