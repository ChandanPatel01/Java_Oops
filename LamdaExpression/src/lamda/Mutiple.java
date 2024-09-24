package lamda;
interface I5{
	int sum(int x,int y);
	//int multi(int a,int b);
}

public class Mutiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I5 obj =( x, y) -> x+y;
         System.out.println( "Sum:"+ obj.sum(78,12));
	}

}
