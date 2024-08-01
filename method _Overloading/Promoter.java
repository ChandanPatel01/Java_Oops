package promotion;
public class Promoter{
   void m1(Integer x,int y){
         System.out.println("Hello Chandan :" +x);
		 System.out.println("Hello Chandan :"+ y);
   }
     void m1(Integer x, String y){
	     System.out.println("Hello Chandan Bhai:"+x);
		  System.out.println("Hello Chandan Bhai:"+y);
	 }
	 public static void main(String[]args){
	    Promoter pr=new Promoter();
		 pr.m1(100, 'A');
		 System.out.println();
		 pr.m1(50,"CHANDAN");
	 
}
}