class Test{
    void m1(){
        int a=50;
        int b=40;
        int c=a+b;
        System.out.println("Result:"+c);
    }
    void m1(int x,int y){
        int z=x-y;
        System.out.println("Sub:"+z);
    }

    void m1(double d,String name){
        System.out.println("Value:"+d);
        System.out.println("Value:"+name);

    }

    public static void main(String[]args){
        Test t=new Test();
        t.m1(78.23,"Chandan");
    }
}