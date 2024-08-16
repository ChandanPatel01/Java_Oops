
class Ducat{
    public static void main(String[]args){
	   Address address=new Address();
	   address.setHouseNo(127);
	    address.setHouseName("Home Villa"); 
		address.setHousePinCode(285124);
		
		
		Student student=new Student();
	     student.setRollNo(101);
	    student.setName("Chandan"); 
		student.setAddress(address);
		
		
		// print Method//
		
		System.out.println("RollNo:"+ student.getRollNo());
		System.out.println("Name:"+student.getName());
		
		Address address1 = student.getAddress();
		
		System.out.println("HouseNo:"+ address1.getHouseNo());
		System.out.println("HouseName:"+ address1.getHouseName());
		System.out.println("Pincode:"+address1. getHousePinCode());
		
	}
}