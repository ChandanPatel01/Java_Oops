public class constOverloading {
    int a=50;
    int b=45;
    int c=a+b;

    constOverloading(){
       
        System.out.println("Result:"+c);
    }
    constOverloading(int x){
        System.out.println("Value:");
    }
    constOverloading(int x,String y){
         System.out.println("Value:" + "   Name"+y);
    }
    public static void main(String[] args) {
        constOverloading co=new constOverloading();
        constOverloading co9=new constOverloading(100);
        constOverloading co2=new constOverloading(10,"Chandan");

    }
    
}
