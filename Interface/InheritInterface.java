interface InheritInterface {
     void india();
    
}
interface  InheritInterface2 extends InheritInterface{
    void usa();
}

 class  Team implements InheritInterface2{
    public void india() 
    {
        System.out.println("India");
    }
    public void usa() 
    {
        System.out.println("Usa");
    }

    public static void main(String[] args) {
        InheritInterface2 t = new Team();
        t.india();
        t.usa();
    }

 }
