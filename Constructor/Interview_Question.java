package intvi;

class Interview_Question {
    int x;          // Instance variable
    static int y;   // Static variable

    void m1() {
        x = x + 1;   // Incrementing instance variable
        y = y + 1;   // Incrementing static variable

        System.out.println(x + " and  " + y);  // Printing the values
    }

    public static void main(String[]args) {
		   Interview_Question. m1();
		
        Interview_Question iq = new Interview_Question();  // Creating an object of the class
        iq.m1();  // Calling the m1 method
		
		Interview_Question iq1 = new Interview_Question();  // Creating an object of the class
        iq1.m1();
		
		Interview_Question iq2 = new Interview_Question();  // Creating an object of the class
        iq2.m1();
		
		
    }
}
