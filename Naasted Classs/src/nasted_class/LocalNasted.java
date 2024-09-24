package nasted_class;

public class LocalNasted {
	public int calculator(int x,int y,char op) {
	  class Opreations{
		  int sum(int x,int y) {
			  return x+y;
		  }
		  int minus(int x,int y) {
			  return x-y;
		  }
	  }
	  Opreations opr =new Opreations();
	  int res=0;
	  if(op=='+') {
		  res=opr.sum(x, y);
	  }
	  else if(op=='-') {
		  res=opr.minus(x, y);
	  }return res;
	  
	}
	public static void main(String[]args) {
//		
		LocalNasted ln=new LocalNasted();
		System.out.println(ln.calculator(5, 8, '-'));
	}

}
