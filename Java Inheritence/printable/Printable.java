package printable;

interface Printable {
    void print();
}

interface Readable {
    void read();
}

class Document implements Printable, Readable {
    public void print() {
        System.out.println("Printing document");
    }

    public void read() {
        System.out.println("Reading document");
    }
}

class Driver {
    public static void main(String[] args) {
        Document d = new Document();
        d.read();
        d.print();
    }
}
