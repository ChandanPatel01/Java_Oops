interface Displayable {
    void display();
}

interface Printable {
    void print();
}


class Document implements Displayable, Printable {
    
    public void display() {
        System.out.println("Displaying the document");
    }

    
    public void print() {
        System.out.println("Printing the document");
    }
    
     public static void main(String[] args) {
        Document doc = new Document();
        doc.display();  
        doc.print();    
    }
}

