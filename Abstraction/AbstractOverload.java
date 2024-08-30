abstract class AbstractOverload {
        abstract void m1();

        abstract void m1(int i);

         public static void m2(){
            System.out.println("Delhi University");
        }

       public  void m3(){
            System.out.println("Punjab University");
        }
        

}
   class Checker extends AbstractOverload{
    public void m1(){
        System.out.println("Hello");
    }
    public void m1(int i){
        System.out.println("Hello "+i);
    }

    public static void main(String[] args) {
        // parent <--- =---------- child
       AbstractOverload ao=new Checker();
        ao.m1();
        ao.m1(10);
        ao.m3();
        AbstractOverload.m2();
        
            
        }
    }


   


