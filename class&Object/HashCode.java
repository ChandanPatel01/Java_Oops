public class HashCode {
    void m1(){
        System.out.println("Hello Sir !");

    }
      void m2(){
        System.out.println("Hello Madam !"+this);
      }
      public static void main(String[] args) {
        HashCode h = new HashCode();
        System.out.println(h);
               
        h.m2();
       
      } 
    
}
