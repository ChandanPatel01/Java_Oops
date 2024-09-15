public class Chain {
        Chain(){

             System.out.println("C");
        }

            Chain(int x){
                     this();
                System.out.println("H");
         }

                Chain(String y){
                     this(10);
                    System.out.println("A");
            }

                    Chain(double d){
                           this("chanadan");
                        System.out.println("N");
                    }

                            Chain(char c){
                                this(78.12);
                                System.out.println("D");
                            }

                            Chain(int x,int y){
                                this('C');
                                System.out.println("A");
                            }

                            Chain(String x,String y){
                                this(5,5);
                                System.out.println("N");
                            }
    public static void main(String[] args) {
        Chain c1 = new Chain("chand","chandan");
        System.out.println(c1);
    }
}
