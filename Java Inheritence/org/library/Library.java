package org.library;

class Library {
    String name;
    String location;

    Library(String name, String location) {
        this.name = name;
        this.location = location;
    }

    void libraryName() {
        System.out.println("Library Name: " + name);
    }

    void libraryLocation() {
        System.out.println("Library Location: " + location);
    }
}

class Section extends Library {
    String section;

    Section(String name, String location, String section) {
        super(name, location);
        this.section = section;
    }

    void sectionName() {
        System.out.println("Section Name: " + section);
    }
}

class Book extends Section {
    String title;
    String author;

    Book(String name, String location, String section, String title, String author) {
        super(name, location, section);
        this.title = title;
        this.author = author;
    }

    void bookTitle() {
        System.out.println("Book Title: " + title);
    }

    void bookAuthor() {
        System.out.println("Book Author: " + author);
    }
}

class Main {
    public static void main(String[] args) {
        Book b = new Book("Central Library", "Main Street", "Science Fiction", "Dune", "Frank Herbert");
        b.libraryName();
        b.libraryLocation();
        b.sectionName();
        b.bookTitle();
        b.bookAuthor();
    }
}
