package double_clss;
class Student_First{
    int id;
	String name;
	char gruop;
	}
public class Student_Second{
	
	public static void main(String[]args){
	Student_First sc=new Student_First();
	sc.id=102;
	sc.name="Chandan";
	sc.gruop='B';
	System.out.println("Id:"+sc.id);
	System.out.println("Name:"+sc.name);
	System.out.println("Gruop:"+sc.gruop);
	
	}
}

