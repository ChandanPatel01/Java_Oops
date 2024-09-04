
public class Untrapted {
    void m1() throws Exception{
       throw new Exception("Untrapted exception");
    }
     void m2() throws Exception{
        System.out.println("Inside m2");
        m1();
        System.out.println("Out");
     }
     void m3() throws Exception{
        System.out.println("Inside m3");
        m2();
        System.out.println("out");
     }
       public static void main(String[] args) {
        System.out.println("IN");
          try {
            new Untrapted().m3();
          } 
          
         catch (Exception e) {
            System.out.println(e);
         }
          finally{
            System.out.println("FIN");
          }
       }
}