package get_clss;
class Get_Clss{
    public static void main(String[]args){
	   Get_Clss gc=new Get_Clss();
	   Class c=gc.getClass();
	   System.out.println(">>"+c);
	   
	   
	   String s=c.getName();
	   System.out.println(">>"+s);
	   
	}
}