package equal_method;
class Equal_Method{
    public static void main(String[]args){
	   Equal_Method em1=new Equal_Method();
	   Equal_Method em2=new Equal_Method();
	   Equal_Method em3=em1;
	   
	   Boolean res=em1.equals(em2);
	   Boolean res1=em1.equals(em3);
	   
	   System.out.println(""  + res);
	   
	   System.out.println(""  + res1);
	   
	}
}