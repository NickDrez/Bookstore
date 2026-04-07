//Nicholas Drez
//892140140
//Lab 6
package Bookstore.Publications;
import Bookstore.Interfaces.Citable;

public class Research extends Publication implements Citable {
    private String[] authors;
    private String journal;
    private int publicationYear;

    public Research(String t, String g, String[] a, String j, int pY) {
        super(t, g);
        this.authors = a;
        this.journal = j;
        this.publicationYear = pY;
    }

    @Override
    public void MLACitation() {
        String authorStr = authors[0] + (authors.length > 1 ? " et al." : "");
        System.out.println(authorStr + ". " + title + ". " + journal + ", " + publicationYear + ".");
    }
}
	
