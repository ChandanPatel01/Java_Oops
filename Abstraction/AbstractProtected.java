abstract class AbstractProtected {
    protected abstract void hero();
    void heroine(){
        System.err.println("Madhuri Dixit");
    }
}
  class Movie extends AbstractProtected{
   protected void hero(){
        System.out.println("Shah Rukh Khan");
    }

    public static void main(String[] args) {
        AbstractProtected ap= new Movie();
        ap.hero();
        ap.heroine();
    }
  }
