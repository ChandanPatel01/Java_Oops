// blank final varibale
//2- static  blank final varibale

class Demo {
    private static final Integer STUDENT_ID; // static final variable
    private static String studentName;

    // Static initializer block to initialize the final variable
    static {
        STUDENT_ID = 101; // Example initialization
    }

    // Constructor
    Demo(String studentName) {
        Demo.studentName = studentName;
    }

    // Static Setter Method
    public static void setStudentName(String studentName) {
        Demo.studentName = studentName;
    }
   
    public static Integer getStudentId() {
        return STUDENT_ID;
    }
   
    public static String getStudentName() { 
        return Demo.studentName;
    }
   
    public static void main(String[] args) {
        // You cannot set STUDENT_ID again, it is final
        // Demo.STUDENT_ID = 102; // This would cause a compilation error
        
        Demo demo = new Demo("RAJ"); 
        System.out.println("Student ID: " + Demo.getStudentId()); 
        System.out.println("Student Name: " + Demo.getStudentName());
        
        Demo demo1 = new Demo("MOHIT"); 
        System.out.println("Student ID: " + Demo.getStudentId()); 
        System.out.println("Student Name: " + Demo.getStudentName()); 
        
        // Updating the static variable
        Demo.setStudentName("RAJ SINGH");
        System.out.println("Updated Student Name: " + Demo.getStudentName());
        
        // Notice that the change is reflected here as well
        System.out.println("Updated Student Name for demo1: " + Demo.getStudentName());
    }
}
