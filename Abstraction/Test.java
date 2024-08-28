abstract class Mix {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract class Dummy extends Mix {
    void m1() {
        System.out.println("Hello I am Fresher");
    }
}

class Test {
    public static void main(String[] args) {
        Dummy dummy = new Dummy() {
			 @Override
            void m2() {
                System.out.println("m2 method implemented");
            }
               @Override
            void m3() {
                System.out.println("m3 method implemented");
            }
        };
        dummy.m1();
		dummy.m2();
		dummy.m3();
    }
}
