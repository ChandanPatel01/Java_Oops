public class Rectangle{
    final int length;
    final int width;

    Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }

    Rectangle(int length){
        this.length=length;
        this.width =20;
    }

    void display(){
        System.out.println("Length: " + length + " Width: " + width);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(15, 20);
        r.display();
        Rectangle r1 = new Rectangle(10);
        r1.display();
    }
}
