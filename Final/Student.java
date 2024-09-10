// blank final varibale
//1-non static  blank final varibale

class Student {
    private final Integer studentId;
    private  String studentName;
   
    
    Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
		
    }

    // Setter Method 
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
   
    public Integer getStudentId() {
        return this.studentId;
    }
   
    public String getStudentName() { 
        return this.studentName;
	
    }
   
    public static void main(String[] args) {
        Student student = new Student(101,"RAJ"); 
		System.out.println("Student ID: " + student.getStudentId()); 
        System.out.println("Student Name: " + student.getStudentName());
		
		
		
		Student student1 = new Student(102,"MOHIT "); 
		System.out.println("Student ID: " + student1.getStudentId()); 
        System.out.println("Student Name: " + student1.getStudentName()); 
		
		
		student.setStudentName("RAJ SINGH");
		System.out.println("Updated Student Name: " + student.getStudentName());
		
		student1.setStudentName("MOHIT KUMAR");
		System.out.println("Updated Student Name: " + student1.getStudentName());
		
		
		
		
        
    }
}
