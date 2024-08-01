class Variable {
 int x=100;
 static int y=20;
 static void m2(){
   System.out.println("With this :"+this.x);
   System.out.println();
   System.out.println("Without This:"+ x);
    System.out.println();
   System.out.println("check this in static :"+this.y);
    System.out.println();
   System.out.println("without classname:"+y);
    System.out.println();
   System.out.println("with class name:"+Variable.y);
   
 }
 public static void main(String[]args){
		 System.out.println(var);
		 this.m2();
		 
 }
}