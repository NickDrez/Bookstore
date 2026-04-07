//Nicholas Drez
//892140140
//Lab 6
package Bookstore.Publications;
import Bookstore.Interfaces.Citable;

public class Book extends Publication implements Citable {
    private String author;
    private String publisher;
    private int publicationYear;

    public Book(String t, String g, String a, String p, int pY) {
        super(t, g);
        this.author = a;
        this.publisher = p;
        this.publicationYear = pY;
    }

    @Override
    public void MLACitation() {
        System.out.println(author + ". " + title + ". " + publisher + ", " + publicationYear + ".");
    }
}