interface AKTU {
    void akg();
    void rkgt();
    void abes();
    default void bca(){
        System.out.println("BCA from AKTU");
    }
}

class AKG1 implements AKTU {
 public void akg() {
        System.out.println("BTECH");
        System.out.println("MTECH");
        System.out.println("MCA");
        System.out.println("\n");
   }

   public void rkgt(){

   }
   public void abes(){

   }
   

}
class RKGT1 implements AKTU{
    public void rkgt() {
        System.out.println("BTECH");
        System.out.println("MTECH");
        System.out.println("MCA");
        System.out.println("\n");
    }
    public void abes() {

    }
    public void akg(){

    }
}


class ABES1 implements AKTU{
    public void abes() {
        System.out.println("BTECH");
        System.out.println("MTECH");
        System.out.println("MCA");
}
   public void akg(){

   }
   public void rkgt (){
    
   }
}
 class AC{
    public static void main(String[] args) {
        AKTU a=new AKG1();
        a.bca();
        a.akg();
        AKTU b=new RKGT1();
        b.rkgt();
        AKTU c=new ABES1();
        c.abes();
        
    }
 }

