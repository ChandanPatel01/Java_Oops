package init_block;
class Common_Task{
{
     System.out.println("Any Common Task");
}

    Common_Task(){
	    System.out.println("Team A");
	}
	
	 Common_Task(int a){
	    System.out.println("Team B");
	}
	 Common_Task(String a){
	    System.out.println("Team C");
	}
	
	public static void main(String[]args){
	    Common_Task ct= new Common_Task();
		Common_Task ct1= new Common_Task();
		Common_Task ct2= new Common_Task();
				
     }
}