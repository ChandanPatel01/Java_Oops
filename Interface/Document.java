interface Displayable {
    void display();
}

interface Printable {
    void print();
}

class Document implements Displayable, Printable {
    
    // Implementing the display method from Displayable interface
    public void display() {
        System.out.println("Displaying the document");
    }

    // Implementing the print method from Printable interface
    public void print() {
        System.out.println("Printing the document");
    }

    // Main method inside the Document class
    public static void main(String[] args) {
        Document doc = new Document();
        doc.display();  // Calls the display method
        doc.print();    // Calls the print method
    }
}
