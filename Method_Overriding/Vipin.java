package overriding;
class SS{
    protected void property(){
	    System.out.println("100 BMW ");
	}
	
	protected void marry(){
	    System.out.println("Supnkha se ");
	}
}
	
	class Vipin extends SS{
	  protected void  marry(){
		  super.marry();
		  System.out.println("Sadi to Karunugo lekin 3 Sal bad  Karungo");
		 }
	  
	  public static void main(String[]args){
	      Vipin vp= new Vipin();
		  vp.marry();
	  }
	}

///pppp
