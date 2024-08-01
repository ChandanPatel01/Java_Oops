package double_clss_Multi;
class Student_First_Multi{
    int id;
	String name;
	char gruop;
	}
public class Student_Second_Multi{
	
	public static void main(String[]args){
	Student_First_Multi sc=new Student_First_Multi();
	Student_First_Multi sc1=new Student_First_Multi();
	
	sc.id=102;
	sc.name="Chandan";
	sc.gruop='B';
	
	sc1.id=107;
	sc1.name="Monu";
	sc1.gruop='D';
	
	System.out.println("Id:"+sc.id);
	System.out.println("Name:"+sc.name);
	System.out.println("Gruop:"+sc.gruop);
	  System.out.println();
	System.out.println("Id:"+sc1.id);
	System.out.println("Name:"+sc1.name);
	System.out.println("Gruop:"+sc1.gruop);
	
	}
}