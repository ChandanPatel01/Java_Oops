interface SimpleInterface{
    abstract  void Student();
    abstract  void Teacher();
    static void  tom(){

    }
    
}

class School implements SimpleInterface{
    public void Student(){
        System.out.println("Student");
    }

    public void Teacher(){
        System.out.println("Student");
    }

    public static void main(String[] args) {
        SimpleInterface si=new School();
        si.Student();
        si.Teacher();
    }

}