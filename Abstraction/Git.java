abstract class Git {
    abstract void m1();
   abstract void m2();
  abstract void m3();
}
abstract class Link extends Git{
    public void m1(){
        System.out.println("m1()");
    }
    public static void main(String[] args) {
      Git  git = new Link()
      {
            public void m2(){}
            public void m3(){};
      };
        git.m1();
    }
    

}
