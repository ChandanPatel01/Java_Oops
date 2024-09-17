class Mix implements Cloneable{
    void show(){
        System.out.println("Hello");

    }
    public Object ObjectClone() throws  CloneNotSupportedException{
         return super.clone();
    }
    
}
class Demo{
    public static void main(String[] args) {
        Mix m1=new Mix();
        try{
            Mix m2=(Mix)m1.ObjectClone();
            m2.show();
        }
        
        catch(CloneNotSupportedException e){
             e.printStackTrace();
        }
    }
}
