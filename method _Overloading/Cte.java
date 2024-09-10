package cte;
public class Cte{
   void m1(int x,long y){
         System.out.println("Hello Chandan :" +x);
		 System.out.println("Hello Chandan :"+ y);
   }
     void m1(long y, int x){
	     System.out.println("Hello Chandan Bhai:"+x);
		  System.out.println("Hello Chandan Bhai:"+y);
	 }
	 public static void main(String[]args){
	    Cte cte=new Cte();
		cte.m1(5,10);
		
		 
	 
}
}