// First interface with a show method
interface Displayable {
    void show();
}

// Second interface with a show method
interface Printable {
    void show();
}

// A class that implements both interfaces
class Document implements Displayable, Printable {
    // Providing a common implementation for both show methods
    public void show() {
        System.out.println("Showing the document");
    }
}

public class Output {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.show();  // Calls the show method from both interfaces
    }
}
