package data_hiding;
class Compeny{
      int x=100;// by super 
}
class Employee extends Compeny{
   int x=200; //by this
   void m1(){
       System.out.println(" EMP:"+ this.x);
	     System.out.println(" EMP:"+this.x);
   }
   public static void main(String[]args){
            Employee emp=new Employee();
			emp.m1();
   }
}