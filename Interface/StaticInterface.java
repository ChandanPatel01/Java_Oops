interface StaticInterface {
    public static void name(){
        System.out.println("Chandan");
    }
   public static void city(){
    System.out.println("Kolkata");

   }
   public int rollNO=101;
   public static String name="Karan";

    
}
class Details implements StaticInterface{
    public static void main(String[] args) {
        StaticInterface.name();
        StaticInterface.city();
        System.out.println("Roll No:"+ rollNO);
        System.out.println("Name :"+ name);
        

    }
    
}
  
