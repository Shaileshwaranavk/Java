package LibrarayBook;

class LibraryBook {
    String title;
    String author;
    boolean isIssued;

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued.");
        } else {
            System.out.println("Book already issued.");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned.");
        } else {
            System.out.println("Book was not issued.");
        }
    }
}

class LibrarySystem {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook();
        book.title = "The Alchemist";
        book.author = "Paulo Coelho";

        book.issueBook();
        book.returnBook();
        book.issueBook();
    }
}
