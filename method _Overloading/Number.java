//Number of Parameter should be diffrent//
package number;
public class Number {
     void sum(int x,int y){
	     System.out.println("Additon:"+ (x+y));
	 }
	 void sum(int x,int y,int z){
	      System.out.println("Additon:"+ (x+y+z));
	 }
	 
	 public static void main(String[]args){
	      Number num=new Number();
		  num.sum(12,12,12);
	 }
}